package cs.home.health.adapter.domain;

import java.io.Serializable;
import java.util.Date;

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
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 3997448997879286177L;

	private Long id;

	private String nickname;

	private String username;

	private String password;

	private Date dateLastLogin;

	@Builder.Default
	private Integer attempts = 0;

	@Builder.Default
	private Boolean blocked = false;

	private Date dateBlocked;

	@Builder.Default
	private Boolean active = true;
}
