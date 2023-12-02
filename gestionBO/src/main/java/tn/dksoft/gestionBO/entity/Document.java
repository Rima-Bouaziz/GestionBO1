package tn.dksoft.gestionBO.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String code;
    private String name;
    private String source;
    private Date dateReception;
    private String subject;
    private String address;
    @OneToOne
    private Etat etat;
    @ManyToOne
    private Reviwer reviwer;
}
