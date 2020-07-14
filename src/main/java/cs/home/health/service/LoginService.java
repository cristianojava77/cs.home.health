package cs.home.health.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs.home.health.domain.Login;
import cs.home.health.repository.LoginRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoginService {

	@Autowired
	private LoginRepository repository;

	/**
	 * Load all entries for the current entity.
	 *
	 * @return All entries currently in the database for the request entity.
	 */
	public List<Login> findAll() {
		log.info("Loading all entries.");
		return repository.findAll();
	}

	/**
	 * Load a single entry based on its Id.
	 *
	 * @param id The ID of the entry to be loaded.
	 * @return
	 */
	public Login getOne(Long id) {
		log.info("Loading a single entry: {}", id);
		return repository.getOne(id);
	}

	/**
	 * Save the received entry into the database.
	 *
	 * @param request The entry to be persisted.
	 */
	public void save(Login request) {
		log.info("Persisting the entry: {}", request);
		repository.save(request);
	}

	/**
	 * Delete an entry based on its ID.
	 * 
	 * @param id The ID of the entry to be removed.
	 */
	public void deleteById(Long id) {
		log.info("Deleting the entry {}.", id);
		repository.deleteById(id);
	}

}
