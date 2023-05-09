package com.example.przychodnia.dao;

import com.example.przychodnia.dao.entity.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends CrudRepository<Patient,Long> {

}
