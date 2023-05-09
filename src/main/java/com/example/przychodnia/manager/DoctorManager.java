package com.example.przychodnia.manager;

import com.example.przychodnia.dao.DoctorRepo;
import com.example.przychodnia.dao.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;


@Service
public class DoctorManager {
    private DoctorRepo doctorRepo;

    @Autowired
    public DoctorManager(DoctorRepo doctorRepo) { this.doctorRepo = doctorRepo; }

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
                .id(1)
                .firstName("Adam")
                .secondName("Kowalski")
                .birthDate(LocalDate.parse("1988-03-02"))
                .specialization("kardiolog")
                .pesel(88041212345L)
                .pwzNumber(88041212345L)
                .title("doktor")
                .email("kadam@gmail.com")
                .address("Szwedzka 34/6")
                .nfz("88041212345")
                .phoneNumber("+48123456789")
                .build());

        save(new Doctor.Builder()
                .id(2)
                .firstName("Karol")
                .secondName("Adamowicz")
                .birthDate(LocalDate.parse("1975-06-11"))
                .specialization("anestezjolog")
                .pesel(75031912345L)
                .pwzNumber(75031912345L)
                .title("doktor")
                .email("akarol@gmail.com")
                .address("Powstancow 17")
                .nfz("75031912345")
                .phoneNumber("+48847209885")
                .build());

        save(new Doctor.Builder()
                .id(3)
                .firstName("Filip")
                .secondName("Dobrodziej")
                .birthDate(LocalDate.parse("1989-05-15"))
                .specialization("ortopeda")
                .pesel(89070154231L)
                .pwzNumber(89070154231L)
                .title("doktor")
                .email("akarol@gmail.com")
                .address("Staszica 20/4")
                .nfz("89070154231")
                .phoneNumber("+48773899221")
                .build());
    }

}
