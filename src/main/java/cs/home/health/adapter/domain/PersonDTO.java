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
public class PersonDTO implements Serializable {

	private static final long serialVersionUID = 3266244944610145060L;

	private Long id;

	private Long idUser;

	private Integer codeMaritalStatus;

	private String fullName;

	private Date dateBirth;

	private String phoneMobile;

	private String phoneHome;

	private String phoneWork;

	private String emailPersonal;

	private String emailWork;

}
