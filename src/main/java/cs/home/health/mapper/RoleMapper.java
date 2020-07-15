package cs.home.health.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cs.home.health.adapter.domain.RoleDTO;
import cs.home.health.domain.Role;

@Service
public class RoleMapper {

	public Role map(RoleDTO request) {
		// @formatter:off
		return Role.builder()
				.active(request.getActive())
				.description(request.getDescription())
				.id(request.getId())
				.title(request.getTitle())
				.build();
		// @formatter:on
	}

	public List<RoleDTO> mapResponse(List<Role> lst) {
		List<RoleDTO> response = new ArrayList<>();
		for (Role cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

	public RoleDTO map(Role domain) {
		// @// @formatter:off
		return RoleDTO.builder()
				.active(domain.getActive())
				.description(domain.getDescription())
				.id(domain.getId())
				.title(domain.getTitle())
				.build();
		// @formatter:on
	}

	public List<Role> mapRequest(List<RoleDTO> lst) {
		//@formatter:off
		List<Role> response = new ArrayList<>();
		for (RoleDTO cur : lst) {
			response.add(map(cur));
		}
		return response;
		//@formatter:on
	}

}
