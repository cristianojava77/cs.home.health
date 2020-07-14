package cs.home.health.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cs.home.health.adapter.domain.MeasurementDTO;
import cs.home.health.domain.Measurement;

@Service
public class MeasurementMapper {

	public Measurement map(MeasurementDTO request) {
		// @formatter:off
		return Measurement.builder()
				.id(request.getId())
				.chest(request.getChest())
				.dateCollected(request.getDateCollected())
				.heartRate(request.getHeartRate())
				.idUser(request.getIdUser())
				.pressureDiastolic(request.getPressureDiastolic())
				.pressureSystolic(request.getPressureSystolic())
				.saturation(request.getSaturation())
				.temperature(request.getTemperature())
				.thighLeft(request.getThighLeft())
				.thighRight(request.getThighRight())
				.upperArmLeft(request.getUpperArmLeft())
				.upperArmRigth(request.getUpperArmRigth())
				.waist(request.getWaist())
				.weight(request.getWeight())
				.build();
		// @formatter:on
	}

	public List<MeasurementDTO> mapResponse(List<Measurement> lst) {
		List<MeasurementDTO> response = new ArrayList<>();
		for (Measurement cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

	public MeasurementDTO map(Measurement domain) {
		// @// @formatter:off
		return MeasurementDTO.builder()
				.id(domain.getId())
				.chest(domain.getChest())
				.dateCollected(domain.getDateCollected())
				.heartRate(domain.getHeartRate())
				.idUser(domain.getIdUser())
				.pressureDiastolic(domain.getPressureDiastolic())
				.pressureSystolic(domain.getPressureSystolic())
				.saturation(domain.getSaturation())
				.temperature(domain.getTemperature())
				.thighLeft(domain.getThighLeft())
				.thighRight(domain.getThighRight())
				.upperArmLeft(domain.getUpperArmLeft())
				.upperArmRigth(domain.getUpperArmRigth())
				.waist(domain.getWaist())
				.weight(domain.getWeight())
				.build();
		// @formatter:on
	}

	public List<Measurement> mapRequest(List<MeasurementDTO> lst) {
		List<Measurement> response = new ArrayList<>();
		for (MeasurementDTO cur : lst) {
			response.add(map(cur));
		}
		return response;
	}

}
