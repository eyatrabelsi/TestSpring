package tn.esprit.trabelsieya.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.trabelsieya.entities.Medecin;
import tn.esprit.trabelsieya.entities.Patient;
import tn.esprit.trabelsieya.entities.RendezVous;
import tn.esprit.trabelsieya.repository.MedecinRepository;
import tn.esprit.trabelsieya.repository.PatientRepository;
import tn.esprit.trabelsieya.repository.RendezVousRepository;

@Service
@AllArgsConstructor
public class RendezVousServiceImp implements IRendezVousService{
    RendezVousRepository rendezVousRepository;
    MedecinRepository medecinRepository;
    PatientRepository patientRepository;
    @Override
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient) {
        RendezVous rendezVous=rendezVousRepository.findById(rdv).orElse(null);
        Medecin medecin=medecinRepository.findById(idMedecin).orElse(null);
        Patient patient=patientRepository.findById(idPatient).orElse(null);
        rendezVous.setMedecin(medecin);
        rendezVous.setPatient(patient);
        rendezVousRepository.save(rendezVous);
    }
}
