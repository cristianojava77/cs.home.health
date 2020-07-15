package cs.home.health.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cs.home.health.adapter.domain.RoleDTO;
import cs.home.health.exception.EntryNotFoundException;
import cs.home.health.mapper.RoleMapper;
import cs.home.health.service.RoleService;

@RestController
@RequestMapping(value = "/role")
public class RoleController {

	private List<RoleDTO> preloadedList = new ArrayList<>();

	@Autowired
	private RoleService service;

	@Autowired
	private RoleMapper mapper;

	@GetMapping("/single/{id}")
	public RoleDTO findSingle(@PathVariable Long id) {
		preload();
		return preloadedList.stream().filter(role -> id.equals(role.getId())).findFirst().orElseThrow(() -> new EntryNotFoundException("Cannot find entry based on the received id."));
	}

	@GetMapping
	public List<RoleDTO> findAll() {
		preload();
		return preloadedList;
	}

	/**
	 * Load from database and store in memory, to avoid unnecessary database hits.
	 */
	private void preload() {
		if (preloadedList.isEmpty()) {
			preloadedList = mapper.mapResponse(service.findAll());
		}
	}

}
