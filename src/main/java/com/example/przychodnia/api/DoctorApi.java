package com.example.przychodnia;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doctors")
public class DoctorApi {
    private List<Doctor> doctorList;

    public DoctorApi(){
        doctorList = new ArrayList<>();
        doctorList.add(new Doctor.Builder()
                .id(1L)
                .firstName("Adam")
                .secondName("Kowalski")
                .build()
        );
        doctorList.add(new Doctor.Builder()
                .id(2L)
                .firstName("Karol")
                .secondName("Adamowicz")
                .build()
        );
    }

    @GetMapping("/all")
    public List<Doctor> getAll(){
        return doctorList;
    }

    @GetMapping("/id")
    public Doctor getById(@RequestParam long index){
        Optional<Doctor> first =  doctorList.stream()
                .filter(element -> element.getId() == index).findFirst();
        return first.get();
    }

    @PostMapping
    public boolean addDoctor(@RequestBody Doctor doctor){
        return doctorList.add(doctor);
    }

    @PutMapping
    public boolean updateDoctor(@RequestBody Doctor doctor){
        return doctorList.add(doctor);
    }

    @DeleteMapping
    public boolean updateDoctor(@RequestParam long index){
        return doctorList.removeIf(element -> element.getId() == index);
    }
}
