package tn.dksoft.gestionBO.service;

import tn.dksoft.gestionBO.entity.Document;

import java.util.List;

public interface IEtatService {
    void deleteDocumentById(Long DocumentId);
    Document updateDocument(Document document, Long documentId);
    List<Document> fetchDocumentList();
}
