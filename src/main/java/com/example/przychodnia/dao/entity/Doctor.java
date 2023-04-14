package com.example.przychodnia.dao.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Doctor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String firstName;
    private String secondName;
    private LocalDate birthDate;
    private String specialization;
    private long pesel;
    private long pwzNumber;
    private String title;
    private String email;
    private String address;
    private String nfz;
    private String phoneNumber;

    public Doctor(long id, String firstName, String secondName, LocalDate birthDate, String specialization, long pesel, long pwzNumber, String title, String email, String address, String nfz, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.specialization = specialization;
        this.pesel = pesel;
        this.pwzNumber = pwzNumber;
        this.title = title;
        this.email = email;
        this.address = address;
        this.nfz = nfz;
        this.phoneNumber = phoneNumber;
    }

    public Doctor() {
    }

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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public long getPwzNumber() {
        return pwzNumber;
    }

    public void setPwzNumber(long pwzNumber) {
        this.pwzNumber = pwzNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNfz() {
        return nfz;
    }

    public void setNfz(String nfz) {
        this.nfz = nfz;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static final class Builder {
        private long id;
        private String firstName;
        private String secondName;
        private LocalDate birthDate;
        private String specialization;
        private long pesel;
        private long pwzNumber;
        private String title;
        private String email;
        private String address;
        private String nfz;
        private String phoneNumber;

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

        public Builder specialization(String specialization) {
            this.specialization = specialization;
            return this;
        }

        public Builder pesel(long pesel) {
            this.pesel = pesel;
            return this;
        }

        public Builder pwzNumber(long pwzNumber) {
            this.pwzNumber = pwzNumber;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder nfz(String nfz) {
            this.nfz = nfz;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }


        public Doctor build() {
            Doctor doctor = new Doctor();
            doctor.id = this.id;
            doctor.firstName = this.firstName;
            doctor.secondName = this.secondName;
            doctor.birthDate = this.birthDate;
            doctor.specialization = this.specialization;
            doctor.pesel = this.pesel;
            doctor.pwzNumber = this.pwzNumber;
            doctor.title = this.title;
            doctor.email = this.email;
            doctor.address = this.address;
            doctor.nfz = this.nfz;
            doctor.phoneNumber = this.phoneNumber;
            return doctor;
        }
    }
}
