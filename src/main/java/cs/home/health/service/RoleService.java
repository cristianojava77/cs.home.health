package cs.home.health.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs.home.health.domain.Role;
import cs.home.health.repository.RoleRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RoleService {

	@Autowired
	private RoleRepository repository;

	/**
	 * Load a single entry based on its language and code.
	 *
	 * @param language The language to be used.
	 * @param code     The code to be located.
	 * @return An <code>Optional</code> containing the entry, or null, if not found.
	 */
	public Optional<Role> findSingle(Long id) {
		log.info("Loading entry based on ID: {}", id);
		return repository.findById(id);
	}

	/**
	 * If a language filter is provided, it will only load the entries for that particular language. Otherwise, all entries will be loaded.
	 *
	 * @return All entries currently in the database for the request entity.
	 */
	public List<Role> findAll() {
		log.info("Loading all entries.");
		return repository.findAll();
	}

}
