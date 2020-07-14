package cs.home.health.domain;

import java.io.Serializable;

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
@Table(name = "tbl_address", indexes = { @Index(columnList = "id_user", name = "idx_address_iduser") })
public class Address implements Serializable {

	private static final long serialVersionUID = 123818095070134425L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "id_user")
	@NotNull(message = "An Address must be connected to an User")
	private Long idUser;

	@Column(name = "id_state")
	private Long idState;

	@Column(name = "code_country")
	private Integer codeCountry;

	private String street;

	private String number;

	private String complement;

	private String reference;

	private String district;

	private String city;

	private String zipcode;

}
