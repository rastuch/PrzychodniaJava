package com.example.przychodnia.manager;

import com.example.przychodnia.dao.PatientRepo;
import com.example.przychodnia.dao.entity.Doctor;
import com.example.przychodnia.dao.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cglib.core.Local;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class PatientManager {
    private PatientRepo patientRepo;

    @Autowired
    public PatientManager(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public Optional<Patient> findById(Long id) {
        return patientRepo.findById(id);
    }

    public Iterable<Patient> findAll() {
        return patientRepo.findAll();
    }

    public Patient save(Patient patient) {
        return patientRepo.save(patient);
    }

    public void delete(Long id) {
        patientRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDbHelper(){
        save(new Patient.Builder()
                .id(1)
                .firstName("Jan")
                .secondName("Kowalski")
                .birthDate(LocalDate.parse("2000-10-10"))
                .pesel(12345678910L)
                .address("Wojska Polskiego 13/4")
                .phoneNumber("+48609422428")
                .weight(79.5)
                .height(180)
                .nfz("+48123456789")
                .build());

        save(new Patient.Builder()
                .id(2)
                .firstName("Andrzej")
                .secondName("Tomczyk")
                .birthDate(LocalDate.parse("1999-10-10"))
                .pesel(99123012762L)
                .address("Klimaczaka 1")
                .phoneNumber("+48609422428")
                .weight(91)
                .height(189)
                .nfz("99123012762")
                .build());

        save(new Patient.Builder()
                .id(3)
                .firstName("Kacper ")
                .secondName("Nowak")
                .birthDate(LocalDate.parse("1999-07-12"))
                .pesel(99471229340L)
                .address("Warszawska 17/3")
                .phoneNumber("+48601234567")
                .weight(73)
                .height(173.2)
                .nfz("99471229340")
                .build());

    }
}
