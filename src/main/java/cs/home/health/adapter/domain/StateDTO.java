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
public class StateDTO implements Serializable {

	private static final long serialVersionUID = 1476166298462645135L;

	private Long id;

	private Integer codeCountry;

	private String abbreviation;

	private String title;

	private Boolean active;

}
