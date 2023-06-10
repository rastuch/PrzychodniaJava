package com.example.przychodnia.api;

import com.example.przychodnia.dao.entity.Doctor;
import com.example.przychodnia.manager.DoctorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping("/api/doctors")
public class DoctorApi {

    private DoctorManager doctors;

    @Autowired
    public DoctorApi(DoctorManager doctors){
        this.doctors = doctors;
    }

    @GetMapping( "/all")
    public Iterable<Doctor> getAll(){
        return doctors.findAll();
    }

    @GetMapping("/id")
    public Optional<Doctor> getById(@RequestParam long index){
       return doctors.findById(index);
    }

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctors.save(doctor);
    }

    @PutMapping
    public Doctor updateDoctor(@RequestBody Doctor doctor){
        return doctors.save(doctor);
    }

    @DeleteMapping
    public void deleteDoctor(@RequestParam long index){
        doctors.delete(index);
    }
}
