package cs.home.health.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
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
@Table(name = "tbl_state", indexes = { @Index(columnList = "code_country", name = "idx_state_codecountry") })
public class State implements Serializable {

	private static final long serialVersionUID = 2065829407246890806L;

	@Id
	private Long id;

	@Column(name = "code_country")
	private Integer codeCountry;

	private String abbreviation;

	private String title;

	private Boolean active;

}
