package cs.home.health.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cs.home.health.adapter.domain.AddressDTO;
import cs.home.health.domain.Address;

@Service
public class AddressMapper {

	public Address map(AddressDTO request) {
		// @formatter:off
		return Address.builder()
				.id(request.getId())
				.city(request.getCity())
				.codeCountry(request.getCodeCountry())
				.complement(request.getComplement())
				.district(request.getDistrict())
				.idState(request.getIdState())
				.idUser(request.getIdUser())
				.number(request.getNumber())
				.reference(request.getReference())
				.street(request.getStreet())
				.zipcode(request.getZipcode())
				.build();
		// @formatter:on
	}

	public List<AddressDTO> mapResponse(List<Address> lst) {
		List<AddressDTO> response = new ArrayList<>();
		for (Address cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

	public AddressDTO map(Address domain) {
		// @// @formatter:off
		return AddressDTO.builder()
				.id(domain.getId())
				.city(domain.getCity())
				.codeCountry(domain.getCodeCountry())
				.complement(domain.getComplement())
				.district(domain.getDistrict())
				.idState(domain.getIdState())
				.idUser(domain.getIdUser())
				.number(domain.getNumber())
				.reference(domain.getReference())
				.street(domain.getStreet())
				.zipcode(domain.getZipcode())
				.build();
		// @formatter:on
	}

	public List<Address> mapRequest(List<AddressDTO> lst) {
		List<Address> response = new ArrayList<>();
		for (AddressDTO cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

}
