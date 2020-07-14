package cs.home.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cs.home.health.adapter.domain.StateDTO;
import cs.home.health.mapper.StateMapper;
import cs.home.health.service.StateService;

@RequestMapping("/state")
@RestController
public class StateController {

	@Autowired
	private StateService stateService;

	@Autowired
	private StateMapper mapper;

	@GetMapping
	public List<StateDTO> getAll(@RequestParam Integer codeCountry) {
		return mapper.mapResponse(stateService.findAllByCodeCountry(codeCountry));
	}

	@GetMapping("/{id}")
	public StateDTO getSingle(@PathVariable("id") Long id) {
		return mapper.map(stateService.getOne(id));
	}

}
