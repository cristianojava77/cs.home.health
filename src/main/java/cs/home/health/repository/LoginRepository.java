package cs.home.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cs.home.health.domain.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
