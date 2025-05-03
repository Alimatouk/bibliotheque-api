package com.biblio.bibliotheque_api.soap.livre;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AjouterLivreRequest", namespace = "http://biblio.com/livres")
@XmlAccessorType(XmlAccessType.FIELD)
public class AjouterLivreRequest {

    @XmlElement(namespace = "http://biblio.com/livres", required = true)
    private String titre;

    @XmlElement(namespace = "http://biblio.com/livres", required = true)
    private String auteur;

    @XmlElement(namespace = "http://biblio.com/livres", required = true)
    private String isbn;

    // Getters et Setters
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}
