package cs.home.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cs.home.health.adapter.domain.LoginDTO;
import cs.home.health.mapper.LoginMapper;
import cs.home.health.service.LoginService;

@RestController
@RequestMapping(value = "/session", produces = { MediaType.APPLICATION_JSON_VALUE })
public class LoginController {

	@Autowired
	private LoginService service;

	@Autowired
	private LoginMapper mapper;

	@PostMapping("/save")
	public String save(@RequestBody LoginDTO request) {
		service.save(mapper.map(request));
		return "Saved successfully";
	}

	@PostMapping("/login")
	public String login(@RequestBody LoginDTO request) {
		// service.save(mapper.map(request));
		return "Login processed";
	}

	@PostMapping("/logout")
	public String logout(@RequestBody LoginDTO request) {
		// service.deleteById(id);
		return "Logout processed";
	}

}
