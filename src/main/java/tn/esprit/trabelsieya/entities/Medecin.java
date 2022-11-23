package tn.esprit.trabelsieya.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecin;
    private String nomMedecin;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private Integer telephone;
    private Integer prixConsultation;
    @ManyToMany(mappedBy="medecins", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Clinique> cliniques;
    @OneToMany(mappedBy = "medecin")
    @JsonIgnore
    private Set<RendezVous> rendezVous;
}
