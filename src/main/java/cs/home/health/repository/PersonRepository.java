package cs.home.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cs.home.health.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
