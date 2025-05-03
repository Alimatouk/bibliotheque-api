package com.biblio.bibliotheque_api.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long livreId;
    private Long utilisateurId;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    public Reservation() {}

    public Reservation(Long livreId, Long utilisateurId, LocalDate dateDebut, LocalDate dateFin) {
        this.livreId = livreId;
        this.utilisateurId = utilisateurId;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getLivreId() { return livreId; }

    public void setLivreId(Long livreId) { this.livreId = livreId; }

    public Long getUtilisateurId() { return utilisateurId; }

    public void setUtilisateurId(Long utilisateurId) { this.utilisateurId = utilisateurId; }

    public LocalDate getDateDebut() { return dateDebut; }

    public void setDateDebut(LocalDate dateDebut) { this.dateDebut = dateDebut; }

    public LocalDate getDateFin() { return dateFin; }

    public void setDateFin(LocalDate dateFin) { this.dateFin = dateFin; }
}
