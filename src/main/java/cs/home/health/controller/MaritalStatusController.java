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

import cs.home.health.adapter.domain.MaritalStatusDTO;
import cs.home.health.exception.EntryNotFoundException;
import cs.home.health.mapper.MaritalStatusMapper;
import cs.home.health.service.MaritalStatusService;

@RequestMapping("/maritalstatus")
@RestController
public class MaritalStatusController {

	private List<MaritalStatusDTO> preloadedList = new ArrayList<>();

	@Autowired
	private MaritalStatusService service;

	@Autowired
	private MaritalStatusMapper mapper;

	@GetMapping("/single/{code}")
	public MaritalStatusDTO findSingle(@PathVariable Integer code, @RequestParam String language) {
		preload();
		return preloadedList.stream().filter(country -> (code.equals(country.getCode()) && language.equals(country.getLanguage()))).findFirst().orElseThrow(() -> new EntryNotFoundException("Cannot find entry based on the received id."));
	}

	@GetMapping
	public List<MaritalStatusDTO> findAll(@RequestParam String language) {
		preload();
		return preloadedList.stream().filter(country -> language.equals(country.getLanguage())).collect(Collectors.toList());
	}

	/**
	 * Load from database and store in memory, to avoid unnecessary database hits.
	 */
	private void preload() {
		if (preloadedList.isEmpty()) {
			preloadedList = mapper.mapResponse(service.findAllByLanguage(null));
		}
	}

}
