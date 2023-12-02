package tn.dksoft.gestionBO.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.dksoft.gestionBO.entity.Etat;
import tn.dksoft.gestionBO.service.EtatService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EtatController {
    // Annotation
    @Autowired
    private EtatService etatService;

    // Save operation
    @PostMapping("/Etat")
    public Etat saveetat(
            @RequestBody Etat etat) {
        return etatService.saveEtat(etat);
    }

    // Read operation
    @GetMapping("/Etat")
    public List<Etat> fetchEtatList() {
        return etatService.fetchEtatList();
    }

    // Update operation
    @PutMapping("/Etat/{id}")
    public Etat updateEtat(@RequestBody Etat etat,
                   @PathVariable("id") Long etatId) {
        System.out.println(etat.toString()+"   "+etatId);
        return etatService.updateEtat(
              etat, etatId);
    }

    // Delete operation
    @DeleteMapping("/Etat/{id}")
    public void deleteEtatById(@PathVariable("id")
                                          Long etatId) {
        etatService.deleteEtatById(etatId);

    }
}
