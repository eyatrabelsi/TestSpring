package tn.esprit.trabelsieya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.trabelsieya.entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
}
