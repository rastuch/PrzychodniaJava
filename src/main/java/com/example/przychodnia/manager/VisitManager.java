package com.example.przychodnia.manager;

import com.example.przychodnia.dao.VisitRepo;
import com.example.przychodnia.dao.entity.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class VisitManager {
    private VisitRepo visitRepo;
    @Autowired
    public VisitManager(VisitRepo visitRepo) {
        this.visitRepo = visitRepo;
    }
    public Optional<Visit> findById(Long id) {
        return visitRepo.findById(id);
    }
    public Iterable<Visit> findAll() {
        return visitRepo.findAll();
    }

    public List<Visit> findAllByPatientId(Long patientId) {
        return visitRepo.findAllByPatientId(patientId);
    }
    public List<Visit> findAllByDoctorId(Long doctorId) {
        return visitRepo.findAllByDoctorId(doctorId);
    }
    public Visit save(Visit visit) {
        return visitRepo.save(visit);
    }
    public void delete(Long id) {
        visitRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDbHelper() {
        save(new Visit.Builder()
                .id(1)
                .doctorId(1)
                .patientId(2)
                .date(LocalDate.parse("2024-07-11"))
                .time(LocalTime.parse("16:15"))
                .build());

        save(new Visit.Builder()
                .id(2)
                .doctorId(1)
                .patientId(3)
                .date(LocalDate.parse("2023-12-12"))
                .time(LocalTime.parse("10:00"))
                .build());

        save(new Visit.Builder()
                .id(3)
                .doctorId(1)
                .patientId(3)
                .date(LocalDate.parse("2027-03-01"))
                .time(LocalTime.parse("08:30"))
                .build());
    }


}
