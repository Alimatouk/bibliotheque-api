package com.biblio.bibliotheque_api.soap.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "RetournerLivreRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class RetournerLivreRequest {

    @XmlElement(required = true)
    private Long idLivre;

    public Long getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(Long idLivre) {
        this.idLivre = idLivre;
    }
}
