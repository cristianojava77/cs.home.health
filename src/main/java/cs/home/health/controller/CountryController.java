package cs.home.health.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cs.home.health.adapter.domain.CountryDTO;
import cs.home.health.exception.EntryNotFoundException;
import cs.home.health.mapper.CountryMapper;
import cs.home.health.service.CountryService;

@RestController
@RequestMapping(value = "/country", produces = { MediaType.APPLICATION_JSON_VALUE })
public class CountryController {

	private List<CountryDTO> preloadedList = new ArrayList<>();

	@Autowired
	private CountryService service;

	@Autowired
	private CountryMapper mapper;

	@GetMapping("/single/{code}")
	public CountryDTO findSingle(@PathVariable Integer code, @RequestParam String language) {
		preload();
		return preloadedList.stream().filter(country -> (code.equals(country.getCode()) && language.equals(country.getLanguage()))).findFirst().orElseThrow(() -> new EntryNotFoundException("Cannot find entry based on the received id."));

	}

	@GetMapping
	public List<CountryDTO> findAll(@RequestParam String language) {
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
