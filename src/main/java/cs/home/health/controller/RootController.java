package cs.home.health.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {

	@GetMapping
	public String getVersion() {
		return "SIG Health - version 0.0.1 (alpha)";
	}

}
