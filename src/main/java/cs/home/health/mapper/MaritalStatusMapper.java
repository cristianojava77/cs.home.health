package cs.home.health.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cs.home.health.adapter.domain.MaritalStatusDTO;
import cs.home.health.domain.MaritalStatus;

@Service
public class MaritalStatusMapper {

	/*
	public MaritalStatus map(MaritalStatusDTO request) {
		// @formatter:off
		return MaritalStatus.builder()
				.id(request.getId())
				.code(request.getCode())
				.language(request.getLanguage())
				.title(request.getTitle())
				.build();
		// @formatter:on
	}
	*/

	public List<MaritalStatusDTO> mapResponse(List<MaritalStatus> lst) {
		List<MaritalStatusDTO> response = new ArrayList<>();
		for (MaritalStatus cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

	public MaritalStatusDTO map(MaritalStatus domain) {
		// @// @formatter:off
		return MaritalStatusDTO.builder()
				.id(domain.getId())
				.code(domain.getCode())
				.language(domain.getLanguage())
				.title(domain.getTitle())
				.build();
		// @formatter:on
	}

	/*
	public List<MaritalStatus> mapRequest(List<MaritalStatusDTO> lst) {
		List<MaritalStatus> response = new ArrayList<>();
		for (MaritalStatusDTO cur : lst) {
			response.add(map(cur));
		}
		return response;
	}
	*/

}
