package tn.esprit.trabelsieya.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.trabelsieya.entities.Patient;
import tn.esprit.trabelsieya.repository.PatientRepository;

@Service
@AllArgsConstructor
public class PatientServiceImp implements IPatientService {
    PatientRepository patientRepository;
    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
