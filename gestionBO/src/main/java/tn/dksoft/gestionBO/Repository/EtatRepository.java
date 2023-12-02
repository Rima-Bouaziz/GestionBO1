package tn.dksoft.gestionBO.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.dksoft.gestionBO.entity.Etat;

@Repository
public interface EtatRepository  extends JpaRepository<Etat,Long> {
}
