package cs.home.health.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cs.home.health.adapter.domain.PersonDTO;
import cs.home.health.domain.Person;

@Service
public class PersonMapper {

	public Person map(PersonDTO request) {
		// @formatter:off
		return Person.builder()
				.id(request.getId())
				.codeMaritalStatus(request.getCodeMaritalStatus())
				.dateBirth(request.getDateBirth())
				.emailPersonal(request.getEmailPersonal())
				.emailWork(request.getEmailWork())
				.fullName(request.getFullName())
				.idUser(request.getIdUser())
				.phoneHome(request.getPhoneHome())
				.phoneMobile(request.getPhoneMobile())
				.phoneWork(request.getPhoneWork())
				.build();
		// @formatter:on
	}

	public List<PersonDTO> mapResponse(List<Person> lst) {
		List<PersonDTO> response = new ArrayList<>();
		for (Person cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

	public PersonDTO map(Person domain) {
		// @// @formatter:off
		return PersonDTO.builder()
				.id(domain.getId())
				.codeMaritalStatus(domain.getCodeMaritalStatus())
				.dateBirth(domain.getDateBirth())
				.emailPersonal(domain.getEmailPersonal())
				.emailWork(domain.getEmailWork())
				.fullName(domain.getFullName())
				.idUser(domain.getIdUser())
				.phoneHome(domain.getPhoneHome())
				.phoneMobile(domain.getPhoneMobile())
				.phoneWork(domain.getPhoneWork())
				.build();
		// @formatter:on
	}

	public List<Person> mapRequest(List<PersonDTO> lst) {
		List<Person> response = new ArrayList<>();
		for (PersonDTO cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

}
