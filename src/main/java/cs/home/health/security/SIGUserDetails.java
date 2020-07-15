package cs.home.health.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import cs.home.health.domain.User;

public class SIGUserDetails implements UserDetails {

	private static final long serialVersionUID = 5470684487844286153L;

	private User user;

	public SIGUserDetails(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return this.user.getPassword();
	}

	@Override
	public String getUsername() {
		return this.user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.user.getActive();
	}

	@Override
	public boolean isAccountNonLocked() {
		return !(this.user.getBlocked());
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.user.getActive();
	}

}
