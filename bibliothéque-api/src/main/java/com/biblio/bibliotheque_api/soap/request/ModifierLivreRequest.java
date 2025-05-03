package com.biblio.bibliotheque_api.soap.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ModifierLivreRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class ModifierLivreRequest {

    @XmlElement(required = true)
    private Long idLivre;

    @XmlElement(required = true)
    private String titre;

    @XmlElement
    private String auteur;

    // Getters et setters
    public Long getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(Long idLivre) {
        this.idLivre = idLivre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
