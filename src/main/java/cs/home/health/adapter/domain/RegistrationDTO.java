package cs.home.health.adapter.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistrationDTO implements Serializable {

	private static final long serialVersionUID = 3997448997879286177L;

	private String nickname;

	private String username;

	private String password;

	private String passwordConfirm;

	private String fullName;

}
