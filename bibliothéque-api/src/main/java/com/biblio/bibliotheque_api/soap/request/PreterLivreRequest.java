package com.biblio.bibliotheque_api.soap.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PreterLivreRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class PreterLivreRequest {

    @XmlElement(required = true)
    private Long idLivre;

    // Getter et setter
    public Long getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(Long idLivre) {
        this.idLivre = idLivre;
    }
}
