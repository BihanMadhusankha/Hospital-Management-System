package edu.iuhs.crm.service;

import edu.iuhs.crm.model.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getPatient();
    void addPatient(Patient patient);
}
