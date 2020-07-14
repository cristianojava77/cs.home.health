package cs.home.health.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cs.home.health.adapter.domain.LoginDTO;
import cs.home.health.domain.Login;

@Service
public class LoginMapper {

	public Login map(LoginDTO request) {
		// @formatter:off
		return Login.builder()
				.id(request.getId())
				.attempts(request.getAttempts())
				.blocked(request.getBlocked())
				.dateBlocked(request.getDateBlocked())
				.dateLastLogin(request.getDateLastLogin())
				.idUser(request.getIdUser())
				.password(request.getPassword())
				.username(request.getUsername())
				.build();
		// @formatter:on
	}

	public List<LoginDTO> mapResponse(List<Login> lst) {
		List<LoginDTO> response = new ArrayList<>();
		for (Login cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

	public LoginDTO map(Login domain) {
		// @// @formatter:off
		return LoginDTO.builder()
				.id(domain.getId())
				.attempts(domain.getAttempts())
				.blocked(domain.getBlocked())
				.dateBlocked(domain.getDateBlocked())
				.dateLastLogin(domain.getDateLastLogin())
				.idUser(domain.getIdUser())
				.password(domain.getPassword())
				.username(domain.getUsername())
				.build();
		// @formatter:on
	}

	public List<Login> mapRequest(List<LoginDTO> lst) {
		List<Login> response = new ArrayList<>();
		for (LoginDTO cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

}
