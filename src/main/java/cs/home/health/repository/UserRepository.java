package cs.home.health.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cs.home.health.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public Optional<User> findByUsername(String username);

}
