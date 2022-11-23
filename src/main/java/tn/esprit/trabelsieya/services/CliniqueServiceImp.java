package tn.esprit.trabelsieya.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.trabelsieya.entities.Clinique;
import tn.esprit.trabelsieya.repository.CliniqueRepository;

@Service
@AllArgsConstructor
public class CliniqueServiceImp implements ICliniqueService {
    CliniqueRepository cliniqueRepository;
    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }
}
