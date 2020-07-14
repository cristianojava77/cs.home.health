package cs.home.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cs.home.health.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
