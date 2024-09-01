package Entities.Business.CastingPrincipal;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "casting_principal")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CastingPrincipal {


    // clé primaire
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_casting")
    private Long idCasting;

    @Column(name = "film_id")
    private String filmId;

    @Column(name = "acteur_id")
    private String acteurId;


    // getters and setters


    @Override
    public String toString() {
        return STR."CastingPrincipal{idCasting=\{idCasting}, film=\{filmId}, acteur=\{acteurId}}";
    }


    public void setCreatedDate(LocalDateTime now) {
        ;
    }

    public void setUpdatedDate(LocalDateTime now) {
    }

    public String getFilm() {
        return filmId;
    }

    public String getActeur() {
        return acteurId;
    }

    public void setFilm(String film) {
    }

    public void setActeur(String acteur) {
    }

}