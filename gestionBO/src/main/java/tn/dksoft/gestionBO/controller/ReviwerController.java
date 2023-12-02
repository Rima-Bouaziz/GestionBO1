package tn.dksoft.gestionBO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.dksoft.gestionBO.entity.Reviwer;
import tn.dksoft.gestionBO.service.ReviwerService;


import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ReviwerController {
    // Annotation
    @Autowired
    private ReviwerService reviwerService;

    // Save operation
    @PostMapping("/Reviwer")
    public Reviwer savereviwer(
            @RequestBody Reviwer reviwer) {
        return reviwerService.saveReviwer(reviwer);
    }

    // Read operation
    @GetMapping("/Reviwer")
    public List<Reviwer> fetchRviwerList() {
        return reviwerService.fetchReviwerList();
    }

    // Update operation
    @PutMapping("/Reviwer/{id}")
    public Reviwer
    updateReviwer(@RequestBody Reviwer reviwer,
               @PathVariable("id") Long reviwerId) {
        System.out.println(reviwer.toString());
        System.out.println(reviwerId);
        return reviwerService.updateReviwer(
                reviwer, reviwerId);
    }

    // Delete operation
    @DeleteMapping("/Reviwer/{id}")
    public void deleteReviwerById(@PathVariable("id")
                                 Long reviwer) {
        reviwerService.deleteReviwerById(reviwer);
    }
}
