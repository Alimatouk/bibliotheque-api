package com.biblio.bibliotheque_api.soap.livre;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AjouterLivreResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class AjouterLivreResponse {

    @XmlElement(required = true)
    private boolean success;

    @XmlElement
    private String message;

    // Getters et setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
