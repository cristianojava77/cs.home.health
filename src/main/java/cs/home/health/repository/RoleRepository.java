package cs.home.health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cs.home.health.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
