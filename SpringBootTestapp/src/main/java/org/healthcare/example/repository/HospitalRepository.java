package org.healthcare.example.repository;

import org.healthcare.example.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long>{

	@Query(" from Hospital hsp where hsp.patient.pid = ?1")
	List<Hospital> findByPatientId(long id);
	
}