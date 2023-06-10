package com.example.przychodnia.dao.entity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Patient {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String firstName;
    private String secondName;
    private LocalDate birthDate;
    private long pesel;
    private String address;
    private String phoneNumber;

    private double weight;
    private double height;
    private String nfz;

    @OneToMany(mappedBy = "patientId")
    private List<Visit> visits;



    public Patient(long id, String firstName, String secondName, LocalDate birthDate, long pesel, String address, String phoneNumber, double weight, double height, String nfz){
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.pesel = pesel;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.weight = weight;
        this.height = height;
        this.nfz = nfz;
    }

    public Patient() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNfz() {
        return nfz;
    }

    public void setNfz(String nfz) {
        this.nfz = nfz;
    }

    public static final class Builder {
        private long id;
        private String firstName;
        private String secondName;
        private LocalDate birthDate;
        private long pesel;
        private String address;
        private String phoneNumber;
        private double weight;
        private double height;
        private String nfz;



        public Builder id(long id) {
            this.id = id;
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }
        public Builder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public Builder pesel(long pesel) {
            this.pesel = pesel;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Builder nfz(String nfz) {
            this.nfz = nfz;
            return this;
        }

        public Patient build() {
            Patient patient = new Patient();
            patient.id = this.id;
            patient.firstName = this.firstName;
            patient.secondName = this.secondName;
            patient.birthDate = this.birthDate;
            patient.pesel = this.pesel;
            patient.address = this.address;
            patient.phoneNumber = this.phoneNumber;
            patient.weight = this.weight;
            patient.height = this.height;
            patient.nfz = this.nfz;

            return patient;
        }
    }
}
