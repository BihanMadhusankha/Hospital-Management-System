package edu.iuhs.crm.controller;

import edu.iuhs.crm.model.Patient;
import edu.iuhs.crm.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/get-all")
    public List<Patient> getPatient(){
        return  patientService.getPatient();
    }

    @PostMapping("/add-patient")
    public void addPatient(@RequestBody Patient patient){
        System.out.println(patient);
        patientService.addPatient(patient);
    }
}
