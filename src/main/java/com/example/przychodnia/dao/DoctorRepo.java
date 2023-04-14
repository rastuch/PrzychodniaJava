package com.example.przychodnia;

import com.example.przychodnia.dao.entity.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends CrudRepository<Doctor, Long> {

}
