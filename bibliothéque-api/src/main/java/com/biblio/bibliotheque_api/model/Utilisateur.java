package com.biblio.bibliotheque_api.model;

import jakarta.persistence.*;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String type; // ex: "etudiant", "professeur", "bibliothecaire"

    public Utilisateur() {}

    public Utilisateur(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }
}

