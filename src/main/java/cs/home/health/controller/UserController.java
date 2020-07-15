package cs.home.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cs.home.health.adapter.domain.UserDTO;
import cs.home.health.mapper.UserMapper;
import cs.home.health.service.UserService;

@RestController
@RequestMapping(value = "/user", produces = { MediaType.APPLICATION_JSON_VALUE })
public class UserController {

	@Autowired
	private UserService service;

	@Autowired
	private UserMapper mapper;

	@GetMapping("/single/{id}")
	public UserDTO getOne(@PathVariable Long id) {
		return mapper.map(service.getOne(id));
	}

	@GetMapping
	public List<UserDTO> findAll() {
		return mapper.mapResponse(service.findAll());
	}

	@PostMapping
	public String save(@RequestBody UserDTO request) {
		service.save(mapper.map(request));
		return "Saved successfully";
	}

	@PostMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") Long id) {
		service.deleteById(id);
		return "Request deleted.";
	}

	@PostMapping("/login")
	public String login(@RequestBody UserDTO request) {
		// service.save(mapper.map(request));
		return "Login processed";
	}

	@PostMapping("/logout")
	public String logout(@RequestBody UserDTO request) {
		// service.deleteById(id);
		return "Logout processed";
	}

}
