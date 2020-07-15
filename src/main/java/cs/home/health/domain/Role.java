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
@Table(name = "tbl_role")
public class Role implements Serializable {

	private static final long serialVersionUID = 8977471149772697011L;

	@Id
	private Long id;

	private String title;

	private String description;

	private Boolean active;

}
