package com.example.przychodnia.api;

import com.example.przychodnia.dao.entity.Patient;
import com.example.przychodnia.manager.PatientManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/patients")
public class PatientApi {

    private PatientManager patients;
    @Autowired
    public PatientApi(PatientManager patients) {
        this.patients = patients;
    }

    @GetMapping("/all")
    public Iterable<Patient> getAll() {
        return patients.findAll();
    }

    @GetMapping("/id")
    public Optional<Patient> getById(@RequestParam long index) {
        return patients.findById(index);
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patients.save(patient);
    }

    @PutMapping
    public Patient updatePatient(@RequestBody Patient patient) {
        return patients.save(patient);
    }

    @DeleteMapping
    public void deletePatient(@RequestParam long index) {
        patients.delete(index);
    }

}
