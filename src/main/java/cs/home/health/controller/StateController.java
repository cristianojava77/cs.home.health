package cs.home.health.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cs.home.health.adapter.domain.StateDTO;
import cs.home.health.exception.EntryNotFoundException;
import cs.home.health.mapper.StateMapper;
import cs.home.health.service.StateService;

@RequestMapping("/state")
@RestController
public class StateController {

	private List<StateDTO> preloadedList = new ArrayList<>();

	@Autowired
	private StateService service;

	@Autowired
	private StateMapper mapper;

	@GetMapping("/single/{id}")
	public StateDTO findSingle(@PathVariable Long id) {
		preload();
		return preloadedList.stream().filter(s -> (id.equals(s.getId()))).findFirst().orElseThrow(() -> new EntryNotFoundException("Cannot find entry based on the received id."));

	}

	@GetMapping
	public List<StateDTO> findAll(@RequestParam Integer countrycode) {
		preload();
		return preloadedList.stream().filter(s -> countrycode.equals(s.getCodeCountry())).collect(Collectors.toList());
	}

	/**
	 * Load from database and store in memory, to avoid unnecessary database hits.
	 */
	private void preload() {
		if (preloadedList.isEmpty()) {
			preloadedList = mapper.mapResponse(service.findAllByCodeCountry(null));
		}
	}

}
