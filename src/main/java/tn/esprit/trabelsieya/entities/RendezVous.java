package tn.esprit.trabelsieya.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RendezVous implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRDV;
    @Temporal(TemporalType.DATE)
    private Date dateRDV;
    private String remarque;
    @ManyToOne
    @JsonIgnore
    private Medecin medecin;
    @ManyToOne
    @JsonIgnore
    private Patient patient;
}
