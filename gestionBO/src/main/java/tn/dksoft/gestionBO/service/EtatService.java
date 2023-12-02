package tn.dksoft.gestionBO.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import tn.dksoft.gestionBO.Repository.EtatRepository;
import tn.dksoft.gestionBO.entity.Etat;

import java.util.List;
import java.util.Objects;
@Service
public class EtatService {
    private EtatRepository etatRepository;

    public EtatService(EtatRepository etatRepository) {
        this.etatRepository = etatRepository;
    }

    // Save operation

    public Etat saveEtat(Etat etat)
    {
        return etatRepository.save(etat);
    }

    // Read operation

    public List<Etat> fetchEtatList()
    {
        return  etatRepository.findAll();
    }
    // Update operation
    public Etat updateEtat(@NotNull Etat etat, Long etatId)
    {
        Etat depDB = etatRepository.findById(etatId).get();

        if (Objects.nonNull(etat.getId())
                && !"".equalsIgnoreCase(String.valueOf(etat.getId()))) {
            depDB.setId(etat.getId());
        }
        if (Objects.nonNull(etat.getDesignation())
                && !"".equalsIgnoreCase(etat.getDesignation())) {
            depDB.setDesignation(etat.getDesignation());
        }
        return etatRepository.save(depDB);
    }

    // Delete operation

    public void deleteEtatById(Long EtatId)
    {
       etatRepository.deleteById(EtatId);
    }


}
