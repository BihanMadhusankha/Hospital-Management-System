package edu.iuhs.crm.repository;

import edu.iuhs.crm.entity.PatientEntity;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<PatientEntity,Integer> {
}
