package tn.esprit.trabelsieya.services;

import tn.esprit.trabelsieya.entities.Medecin;

public interface IMedecinService {
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId);
}
