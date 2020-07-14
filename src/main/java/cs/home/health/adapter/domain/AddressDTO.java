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
public class AddressDTO implements Serializable {

	private static final long serialVersionUID = 3161017216159628765L;

	private Long id;

	private Long idUser;

	private Long idState;

	private Integer codeCountry;

	private String street;

	private String number;

	private String complement;

	private String reference;

	private String district;

	private String city;

	private String zipcode;

}
