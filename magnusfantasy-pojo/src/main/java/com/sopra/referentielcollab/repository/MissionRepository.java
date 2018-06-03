package com.sopra.referentielcollab.repository;

import org.springframework.data.repository.CrudRepository;

import com.sopra.referentielcollab.pojo.Mission;

public interface MissionRepository extends CrudRepository<Mission, Long> {

	public Mission findById(long id);
}
