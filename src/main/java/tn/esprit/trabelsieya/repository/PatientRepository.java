package tn.esprit.trabelsieya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.trabelsieya.entities.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long> {
}
