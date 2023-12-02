package tn.dksoft.gestionBO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.dksoft.gestionBO.entity.Reviwer;

@Repository

public interface ReviwerRepository extends JpaRepository<Reviwer,Long> {

}
