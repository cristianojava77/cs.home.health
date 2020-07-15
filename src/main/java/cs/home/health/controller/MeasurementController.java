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

import cs.home.health.adapter.domain.MeasurementDTO;
import cs.home.health.mapper.MeasurementMapper;
import cs.home.health.service.MeasurementService;

@RestController
@RequestMapping(value = "/measurement", produces = { MediaType.APPLICATION_JSON_VALUE })
public class MeasurementController {

	@Autowired
	private MeasurementService service;

	@Autowired
	private MeasurementMapper mapper;

	@GetMapping("/single/{id}")
	public MeasurementDTO getOne(@PathVariable Long id) {
		return mapper.map(service.getOne(id));
	}

	@GetMapping
	public List<MeasurementDTO> findAll() {
		return mapper.mapResponse(service.findAll());
	}

	@PostMapping
	public String save(@RequestBody MeasurementDTO request) {
		service.save(mapper.map(request));
		return "Saved successfully";
	}

	@PostMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") Long id) {
		service.deleteById(id);
		return "Request deleted.";
	}

}
