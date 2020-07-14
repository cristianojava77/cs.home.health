package cs.home.health.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cs.home.health.domain.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

	public List<Country> findAllByLanguageOrderByTitle(String language);

	public List<Country> findAllByCodeAndLanguage(Integer code, String language);

	public List<Country> findAllByOrderByTitle();

}
