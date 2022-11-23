package tn.esprit.trabelsieya.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.trabelsieya.entities.Clinique;
import tn.esprit.trabelsieya.entities.Medecin;
import tn.esprit.trabelsieya.repository.CliniqueRepository;
import tn.esprit.trabelsieya.repository.MedecinRepository;
@Service
@AllArgsConstructor
public class MedecinServiceImp implements IMedecinService{
    MedecinRepository medecinRepository;
    CliniqueRepository cliniqueRepository;

    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        Clinique clinique=cliniqueRepository.findById(cliniqueId).orElse(null);
        /*medecin.setCliniques()*/
        medecinRepository.save(medecin);
        return medecin;
    }
}
