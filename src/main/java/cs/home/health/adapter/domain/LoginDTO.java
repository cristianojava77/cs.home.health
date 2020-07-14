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
public class LoginDTO implements Serializable {

	private static final long serialVersionUID = -8210187048465650818L;

	private Long id;

	private Long idUser;

	private String username;

	private String password;

	@Builder.Default
	private Boolean blocked = false;

	@Builder.Default
	private Integer attempts = 0;

	private Date dateLastLogin;

	private Date dateBlocked;

}
