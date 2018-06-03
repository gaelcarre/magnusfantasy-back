package com.sopra.referentielcollab.repository;

import org.springframework.data.repository.CrudRepository;
import com.sopra.referentielcollab.pojo.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

		//public Client findById(long id);
}
