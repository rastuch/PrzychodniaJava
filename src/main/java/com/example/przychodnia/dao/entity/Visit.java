package com.example.przychodnia.dao.entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
@Table(name = "visits")
@Entity
public class Visit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private long patientId;

    private long doctorId;

    private LocalDate date;

    private LocalTime time;

    @ManyToOne
    @JoinColumn(name = "patientId",insertable=false, updatable=false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctorId",insertable=false, updatable=false)
    private Doctor doctor;

    public Visit(long id, long patientId, long doctorId, LocalDate date, LocalTime time) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
    }

    public Visit() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public static final class Builder {
        private long id;
        private long patientId;
        private long doctorId;
        private LocalDate date;
        private LocalTime time;

        public Visit.Builder id(long id) {
            this.id = id;
            return this;
        }
        public Visit.Builder patientId(long patientId) {
            this.patientId = patientId;
            return this;
        }
        public Visit.Builder doctorId(long doctorId) {
            this.doctorId = doctorId;
            return this;
        }
        public Visit.Builder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public Visit.Builder time(LocalTime time) {
            this.time = time;
            return this;
        }

        public Visit build() {
            Visit visit = new Visit();
            visit.id = this.id;
            visit.patientId = this.patientId;
            visit.doctorId = this.doctorId;
            visit.date = this.date;
            visit.time = this.time;

            return visit;
        }
    }

}
