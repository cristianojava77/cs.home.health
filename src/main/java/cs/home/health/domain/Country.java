package cs.home.health.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "tbl_country")
public class Country implements Serializable {

	private static final long serialVersionUID = 2065829407246890806L;

	@Id
	private Long id;

	private Long code;

	private String title;

	private String language;

	private String abbreviation;

	private Boolean active;

}
