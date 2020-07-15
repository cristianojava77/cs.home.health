package cs.home.health.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cs.home.health.adapter.domain.UserDTO;
import cs.home.health.domain.User;

@Service
public class UserMapper {

	public User map(UserDTO request) {
		// @formatter:off
		return User.builder()
				.id(request.getId())
				.active(request.getActive())
				.attempts(request.getAttempts())
				.blocked(request.getBlocked())
				.dateBlocked(request.getDateBlocked())
				.dateLastLogin(request.getDateLastLogin())
				.nickname(request.getNickname())
				.password(request.getPassword())
				.username(request.getUsername())
				.build();
		// @formatter:on
	}

	public List<UserDTO> mapResponse(List<User> lst) {
		List<UserDTO> response = new ArrayList<>();
		for (User cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

	public UserDTO map(User domain) {
		// @// @formatter:off
		return UserDTO.builder()
				.id(domain.getId())
				.active(domain.getActive())
				.attempts(domain.getAttempts())
				.blocked(domain.getBlocked())
				.dateBlocked(domain.getDateBlocked())
				.dateLastLogin(domain.getDateLastLogin())
				.nickname(domain.getNickname())
				.password(domain.getPassword())
				.username(domain.getUsername())
				.build();
		// @formatter:on
	}

	public List<User> mapRequest(List<UserDTO> lst) {
		List<User> response = new ArrayList<>();
		for (UserDTO cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

}
