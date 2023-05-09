package com.example.przychodnia.api;

import com.example.przychodnia.dao.entity.Doctor;
import com.example.przychodnia.dao.entity.Visit;
import com.example.przychodnia.manager.VisitManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/visits")
public class VisitApi {

    private VisitManager visits;

    @Autowired
    public VisitApi(VisitManager visits) {
        this.visits = visits;
    }

    @GetMapping("/all")
    public Iterable<Visit> getAll() {
        return visits.findAll();
    }
    @GetMapping("/id")
    public Optional<Visit> getById(@RequestParam long index) {
        return visits.findById(index);
    }
    @GetMapping("/patient/{patientId}/visits")
    public Iterable<Visit> findAllByPatientId(@PathVariable Long patientId) {
        return visits.findAllByPatientId(patientId);
    }

    @GetMapping("/doctor/{doctorId}/visits")
    public Iterable<Visit> findAllByDoctorId(@PathVariable Long doctorId) {
        return visits.findAllByDoctorId(doctorId);
    }
    @PostMapping
    public Visit addVisit(@RequestBody Visit visit){
        return visits.save(visit);
    }

    @PutMapping
    public Visit updateVisit(@RequestBody Visit visit) {
        return visits.save(visit);
    }
    @DeleteMapping
    public void deleteVisit(@RequestParam long index) {
        visits.delete(index);
    }
}
