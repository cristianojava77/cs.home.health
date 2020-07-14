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
@Table(name = "tbl_measurement", indexes = { @Index(columnList = "id_user", name = "idx_measurement_iduser") })
public class Measurement implements Serializable {

	private static final long serialVersionUID = 6148733729256523206L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "id_user")
	@NotNull(message = "A Person must be connected to an User")
	private Long idUser;

	@Builder.Default
	@NotNull(message = "Cannot take a measurement without date")
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
