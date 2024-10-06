package edu.iuhs.crm.service;
import edu.iuhs.crm.entity.PatientEntity;
import edu.iuhs.crm.model.Patient;
import edu.iuhs.crm.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{


    final PatientRepository patientRepository;
    final ModelMapper modelMapper;

    @Override
    public List<Patient> getPatient() {
        List<Patient> patientList = new ArrayList<>();
        patientRepository.findAll().forEach(pv -> patientList.add(modelMapper.map(pv, Patient.class)));
        return patientList;
    }

    @Override
    public void addPatient( Patient patient) {

        patientRepository.save(modelMapper.map(patient, PatientEntity.class));
    }
}
