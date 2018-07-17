package fr.gaelcarre.magnusfantasy.config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import fr.gaelcarre.magnusfantasy.pojo.Utilisateur;

public class CustomPrincipal implements UserDetails {

	private Utilisateur utilisateur;

	public CustomPrincipal(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	public String getPassword() {
		return this.utilisateur.getMdp();
	}

	public String getUsername() {
		return this.utilisateur.getLogin();
	}

	public boolean isAccountNonExpired() {
		return true;
	}

	public boolean isAccountNonLocked() {
		return true;
	}

	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return true;
	}

}
