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
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 3997448997879286177L;

	private Long id;

	private String name;

	@Builder.Default
	private Boolean active = true;
}
