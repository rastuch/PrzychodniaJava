package com.example.przychodnia.manager;

import com.example.przychodnia.dao.DoctorRepo;
import com.example.przychodnia.dao.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DoctorManager {
    private DoctorRepo doctorRepo;

    @Autowired
    public DoctorManager(DoctorRepo doctorRepo){
        this.doctorRepo = doctorRepo;
    }

    public Optional<Doctor> findById(Long id){
        return doctorRepo.findById(id);
    }

    public Iterable<Doctor> findAll(){
        return doctorRepo.findAll();
    }

    public Doctor save(Doctor doctor){
        return doctorRepo.save(doctor);
    }

    public void delete(Long id){
        doctorRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDbHelper(){

        save(new Doctor.Builder()
                .id(1L)
                .firstName("Adam")
                .secondName("Kowalski")
                .build());

        save(new Doctor.Builder()
                .id(2L)
                .firstName("Karol")
                .secondName("Adamowicz")
                .build());
    }

}
