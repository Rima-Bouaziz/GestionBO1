package tn.dksoft.gestionBO.service;

import tn.dksoft.gestionBO.entity.Document;
import tn.dksoft.gestionBO.Repository.DocumentRepository;
// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service

// Class
public  class  DocumentService implements IDocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    // Save operation

    public Document saveDocument(Document document)
    {
        return documentRepository.save(document);
    }

    // Read operation

    public List<Document> fetchDocumentList()
    {
        return (List<Document>)
                documentRepository.findAll();
    }
    // Update operation
    public Document
    updateDocument(Document document,Long documentId)
    {
        Document depDB = documentRepository.findById(documentId).get();
        if (Objects.nonNull(document.getName())
                && !"".equalsIgnoreCase(document.getName())) {
            depDB.setName(document.getName());
        }
        if (Objects.nonNull(document.getAddress())
                && !"".equalsIgnoreCase(document.getAddress())) {
            depDB.setAddress(document.getAddress());
        }
        if (Objects.nonNull(document.getCode())
                && !"".equalsIgnoreCase(
                document.getCode())) {
            depDB.setCode(
                    document.getCode());
        }
        if (Objects.nonNull(document.getSource())
                && !"".equalsIgnoreCase(
                document.getSource())) {
            depDB.setSource(
                    document.getSource());
        }
        if (Objects.nonNull(document.getSubject())
                && !"".equalsIgnoreCase(
                document.getSubject())) {
            depDB.setSubject(
                    document.getSubject());
        }
        if (Objects.nonNull(document.getEtat())
              ) {
            depDB.setEtat(
                    document.getEtat());
        }
        if (Objects.nonNull(document.getReviwer())
              ) {
            depDB.setReviwer(
                    document.getReviwer());
        }

        return documentRepository.save(depDB);
    }

    // Delete operation
    @Override
    public void deleteDocumentById(Long DocumentId)
    {
        documentRepository.deleteById(DocumentId);
    }


}
