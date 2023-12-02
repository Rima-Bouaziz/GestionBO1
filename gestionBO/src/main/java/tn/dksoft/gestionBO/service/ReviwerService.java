package tn.dksoft.gestionBO.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import tn.dksoft.gestionBO.Repository.EtatRepository;
import tn.dksoft.gestionBO.Repository.ReviwerRepository;
import tn.dksoft.gestionBO.entity.Etat;
import tn.dksoft.gestionBO.entity.Reviwer;

import java.util.List;
import java.util.Objects;

@Service
public class ReviwerService {
    private ReviwerRepository reviwerRepository;

    public ReviwerService(ReviwerRepository reviwerRepository) {
        this.reviwerRepository = reviwerRepository;
    }
// Save operation

    public Reviwer saveReviwer(Reviwer reviwer)
    {
        return reviwerRepository.save(reviwer);
    }

    // Read operation

    public List<Reviwer> fetchReviwerList()
    {
        return  reviwerRepository.findAll();
    }
    // Update operation
    public Reviwer updateReviwer(@NotNull Reviwer reviwer, Long reviwerId)
    {
       Reviwer depDB = reviwerRepository.findById(reviwerId).get();


        if (Objects.nonNull(reviwer.getName())
                && !"".equalsIgnoreCase(reviwer.getName())) {
            depDB.setName(reviwer.getName());
        }



        return reviwerRepository.save(depDB);
    }

    // Delete operation

    public void deleteReviwerById(Long ReviwerId) {
        reviwerRepository.deleteById(ReviwerId);
    }
}
