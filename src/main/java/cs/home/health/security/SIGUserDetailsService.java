package cs.home.health.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cs.home.health.exception.EntryNotFoundException;
import cs.home.health.repository.UserRepository;

@Service
public class SIGUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new SIGUserDetails(userRepository.findByUsername(username).orElseThrow(() -> new EntryNotFoundException("Username or password do not match")));
	}

}
