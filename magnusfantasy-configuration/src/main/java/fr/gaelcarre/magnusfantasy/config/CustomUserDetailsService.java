package fr.gaelcarre.magnusfantasy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.gaelcarre.magnusfantasy.pojo.Utilisateur;
import fr.gaelcarre.magnusfantasy.repository.UtilisateurRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UtilisateurRepository utilisateurRepository;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Utilisateur utilisateur = this.utilisateurRepository.findByLogin(username);
		if (utilisateur == null) {
			throw new UsernameNotFoundException(username);
		}

		return new CustomPrincipal(utilisateur);
	}

}
