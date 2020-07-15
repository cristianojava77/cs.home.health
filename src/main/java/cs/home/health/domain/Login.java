package cs.home.health.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
@Table(name = "tbl_login", indexes = { @Index(columnList = "id_user", name = "idx_login_iduser") })
public class Login implements Serializable {

	private static final long serialVersionUID = 6496402764374123162L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "id_user")
	@NotNull(message = "User not provided")
	private Long idUser;

	@NotEmpty(message = "Cannot create an user with a blank username")
	private String username;

	@NotEmpty(message = "Cannot create an user with a blank password")
	private String password;

	@Builder.Default
	private Boolean blocked = false;

	@Builder.Default
	private Integer attempts = 0;

	@Column(name = "date_last_login")
	private Date dateLastLogin;

	@Column(name = "date_blocked")
	private Date dateBlocked;

}
