package tn.esprit.trabelsieya.services;

import tn.esprit.trabelsieya.entities.RendezVous;

public interface IRendezVousService {
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin,Long idPatient);
}
