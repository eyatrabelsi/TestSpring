package tn.esprit.trabelsieya.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.trabelsieya.entities.Patient;
import tn.esprit.trabelsieya.services.IPatientService;

@RestController
@AllArgsConstructor
public class PatientController {
    IPatientService iPatientService;
    @PostMapping("/addPatient")
    @ResponseBody
    public Patient addPatient(@RequestBody Patient patient){
        return iPatientService.addPatient(patient);
    }
}
