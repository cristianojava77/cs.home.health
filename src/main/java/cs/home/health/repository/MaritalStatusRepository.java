package cs.home.health.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cs.home.health.domain.MaritalStatus;

public interface MaritalStatusRepository extends JpaRepository<MaritalStatus, Long> {

	public List<MaritalStatus> findAllByLanguageOrderByTitle(String language);

	public List<MaritalStatus> findAllByCodeAndLanguage(Integer code, String language);

}
