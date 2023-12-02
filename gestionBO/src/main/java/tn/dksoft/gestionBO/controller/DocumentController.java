package tn.dksoft.gestionBO.controller;

        import tn.dksoft.gestionBO.entity.Document;

        import java.util.List;
      //  import javax.validation.Valid;
// Importing required classes
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
        import tn.dksoft.gestionBO.entity.Etat;
        import tn.dksoft.gestionBO.service.DocumentService;

// Annotation
@RestController
@CrossOrigin(origins = "*")
// Class
public class DocumentController {

    // Annotation
    @Autowired private DocumentService documentService;

    // Save operation
    @PostMapping("/Document")
    public Document saveDocument(
            @RequestBody Document document)
    {
        return documentService.saveDocument(document);
    }

    // Read operation
    @GetMapping("/Document")
    public List<Document> fetchDocumentList()
    {
        return documentService.fetchDocumentList();
    }

    // Update operation
    @PutMapping("/Document/{id}")
    public Document
    updateDocument(@RequestBody Document document,
                     @PathVariable("id") Long documentId)
    {

        return documentService.updateDocument(
                document, documentId);
    }

    // Delete operation
    @DeleteMapping("/Document/{id}")
    public void deleteDocumentById(@PathVariable("id")
                                       Long documentId)
    {
        documentService.deleteDocumentById( documentId);

    }
}

