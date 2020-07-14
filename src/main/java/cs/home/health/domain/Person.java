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
@Table(name = "tbl_person", indexes = { @Index(columnList = "id_user", name = "idx_person_iduser") })
public class Person implements Serializable {

	private static final long serialVersionUID = 523044575269691335L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "id_user")
	@NotNull(message = "A Person must be connected to an User")
	private Long idUser;

	@Column(name = "code_marital_status")
	private Integer codeMaritalStatus;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "date_birth")
	private Date dateBirth;

	@Column(name = "phone_mobile")
	private String phoneMobile;

	@Column(name = "phone_home")
	private String phoneHome;

	@Column(name = "phone_work")
	private String phoneWork;

	@Column(name = "email_personal")
	private String emailPersonal;

	@Column(name = "email_work")
	private String emailWork;

}
