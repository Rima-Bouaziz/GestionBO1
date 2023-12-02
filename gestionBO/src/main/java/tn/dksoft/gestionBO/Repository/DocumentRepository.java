package tn.dksoft.gestionBO.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.dksoft.gestionBO.entity.Document;

@Repository

public interface DocumentRepository extends JpaRepository<Document,Long> {
}







