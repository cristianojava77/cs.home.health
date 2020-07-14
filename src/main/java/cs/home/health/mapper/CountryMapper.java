package cs.home.health.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cs.home.health.adapter.domain.CountryDTO;
import cs.home.health.domain.Country;

@Service
public class CountryMapper {

	public Country map(CountryDTO request) {
		// @formatter:off
		return Country.builder()
				.abbreviation(request.getAbbreviation())
				.active(request.getActive())
				.code(request.getCode())
				.id(request.getId())
				.language(request.getLanguage())
				.title(request.getTitle())
				.build();
		// @formatter:on
	}

	public List<CountryDTO> mapResponse(List<Country> lst) {
		List<CountryDTO> response = new ArrayList<>();
		for (Country cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

	public CountryDTO map(Country domain) {
		// @// @formatter:off
		return CountryDTO.builder()
				.abbreviation(domain.getAbbreviation())
				.active(domain.getActive())
				.code(domain.getCode())
				.id(domain.getId())
				.language(domain.getLanguage())
				.title(domain.getTitle())
				.build();
		// @formatter:on
	}

	public List<Country> mapRequest(List<CountryDTO> lst) {
		List<Country> response = new ArrayList<>();
		for (CountryDTO cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

}
