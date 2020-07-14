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
public class MeasurementDTO implements Serializable {

	private static final long serialVersionUID = -7154258230630851690L;

	private Long id;

	private Long idUser;

	@Builder.Default
	private Date dateCollected = new Date();

	private Integer heartRate;

	private Integer temperature;

	private Integer pressureSystolic;

	private Integer pressureDiastolic;

	private Integer weight;

	private Integer saturation;

	private Integer waist;

	private Integer chest;

	private Integer thighLeft;

	private Integer thighRight;

	private Integer upperArmLeft;

	private Integer upperArmRigth;
}
