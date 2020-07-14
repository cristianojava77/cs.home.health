package cs.home.health.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cs.home.health.domain.State;

public interface StateRepository extends JpaRepository<State, Long> {

	public List<State> findAllByCodeCountryOrderByTitle(Integer codeCountry);

	public List<State> findAllByOrderByTitle();
}
