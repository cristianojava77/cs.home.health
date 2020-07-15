package cs.home.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cs.home.health.adapter.domain.RegistrationDTO;
import cs.home.health.domain.Address;
import cs.home.health.domain.Person;
import cs.home.health.domain.User;
import cs.home.health.exception.PasswordValidationException;
import cs.home.health.service.AddressService;
import cs.home.health.service.PersonService;
import cs.home.health.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/registration", produces = { MediaType.APPLICATION_JSON_VALUE })
public class RegistrationController {

	@Autowired
	private UserService userService;

	@Autowired
	private PersonService personService;

	@Autowired
	private AddressService addressService;

	@PostMapping
	public String save(@RequestBody RegistrationDTO request) {
		// double-checking password
		if (StringUtils.isEmpty(request.getPassword()) || StringUtils.isEmpty(request.getPasswordConfirm())) {
			throw new PasswordValidationException("Neither Password nor Password Validation fields can be empty.");
		} else if (!request.getPassword().equals(request.getPasswordConfirm())) {
			throw new PasswordValidationException("Password validation did not match.");
		} else {
			userService.validPassword(request.getPassword());
			//@formatter:off
			final User user = userService.save(User.builder()
					.nickname(request.getNickname())
					.password(request.getPassword())
					.username(request.getUsername())
					.build());
			//@formatter:on
			log.info("User persisted. New ID: {}", user.getId());
			//@formatter:off
			personService.save(Person.builder()
					.fullName(request.getFullName())
					.idUser(user.getId())
					.build());
			//@formatter:on
			log.info("Person persisted...");
			addressService.save(Address.builder().idUser(user.getId()).build());
			log.info("Address persisted. Registration worked fine!");
		}
		return "Saved successfully";
	}
}
