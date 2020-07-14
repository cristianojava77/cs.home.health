package cs.home.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cs.home.health.domain.Measurement;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {

}
