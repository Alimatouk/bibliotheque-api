package com.biblio.bibliotheque_api.soap.response;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RetournerLivreResponse")
public class RetournerLivreResponse {
    
    private String message;

    // Getter
    public String getMessage() {
        return message;
    }

    // Setter
    public void setMessage(String message) {
        this.message = message;
    }
}
