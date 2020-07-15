package cs.home.health.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_user")
public class User implements Serializable {

	private static final long serialVersionUID = -4302730040994605185L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Nickname is mandatory")
	private String nickname;

	@NotEmpty(message = "Cannot create an user with a blank username")
	@Column(nullable = false, unique = true)
	private String username;

	@NotEmpty(message = "Cannot create an user with a blank password")
	private String password;

	@Column(name = "date_last_login")
	private Date dateLastLogin;

	@Builder.Default
	private Integer attempts = 0;

	@Builder.Default
	private Boolean blocked = false;

	@Column(name = "date_blocked")
	private Date dateBlocked;

	@Builder.Default
	private Boolean active = true;

}
