package cs.home.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cs.home.health.adapter.domain.MaritalStatusDTO;
import cs.home.health.exception.InvalidRequestException;
import cs.home.health.mapper.MaritalStatusMapper;
import cs.home.health.service.MaritalStatusService;

@RequestMapping("/maritalstatus")
@RestController
public class MaritalStatusController {

	@Autowired
	private MaritalStatusService service;

	@Autowired
	private MaritalStatusMapper mapper;

	@GetMapping("/single/{code}")
	public MaritalStatusDTO findSingle(@PathVariable Integer code, @RequestParam String language) {
		return mapper.map(service.findOneByCodeAndLanguage(language, code).orElseThrow(() -> new InvalidRequestException("Cannot find entry based on the received code.")));
	}

	@GetMapping
	public List<MaritalStatusDTO> findAll(@RequestParam String language) {
		return mapper.mapResponse(service.findAllByLanguage(language));
	}

}
