package fr.gaelcarre.magnusfantasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.gaelcarre.magnusfantasy.pojo.UtilisateurRole;

@Repository
public interface UtilisateurRoleRepository extends CrudRepository<UtilisateurRole, Long> {
	// @Query("select a.role from UserRole a, User b where b.userName=?1 and
	// a.userid=b.userId")
	// public List<String> findRoleByUserName(String username);
}
