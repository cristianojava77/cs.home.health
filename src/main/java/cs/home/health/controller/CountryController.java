package cs.home.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cs.home.health.adapter.domain.CountryDTO;
import cs.home.health.exception.InvalidRequestException;
import cs.home.health.mapper.CountryMapper;
import cs.home.health.service.CountryService;

@RestController
@RequestMapping(value = "/country", produces = { MediaType.APPLICATION_JSON_VALUE })
public class CountryController {

	@Autowired
	private CountryService service;

	@Autowired
	private CountryMapper mapper;

	@GetMapping("/single/{code}")
	public CountryDTO findOneByCodeAndLanguage(@PathVariable Integer code, @RequestParam String language) {
		return mapper.map(service.findOneByCodeAndLanguage(language, code).orElseThrow(() -> new InvalidRequestException("Cannot find entry based on the received code.")));
	}

	@GetMapping
	public List<CountryDTO> findAllByLanguage(@RequestParam String language) {
		return mapper.mapResponse(service.findAllByLanguage(language));
	}

	@PostMapping
	public String save(@RequestBody CountryDTO request) {
		service.save(mapper.map(request));
		return "Saved successfully";
	}

	@PostMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") Long id) {
		service.deleteById(id);
		return "Request deleted.";
	}

}
