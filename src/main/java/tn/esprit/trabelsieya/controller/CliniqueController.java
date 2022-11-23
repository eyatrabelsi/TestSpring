package tn.esprit.trabelsieya.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.trabelsieya.entities.Clinique;
import tn.esprit.trabelsieya.services.ICliniqueService;

@RestController
@AllArgsConstructor
public class CliniqueController {
    ICliniqueService iCliniqueService;
    @PostMapping("/addClinique")
    @ResponseBody
    public Clinique addClinique(@RequestBody Clinique clinique){
        return iCliniqueService.addClinique(clinique);
    }
}
