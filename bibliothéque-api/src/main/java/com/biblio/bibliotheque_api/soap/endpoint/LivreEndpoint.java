package com.biblio.bibliotheque_api.soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.biblio.bibliotheque_api.model.Livre;
import com.biblio.bibliotheque_api.service.LivreService;
import com.biblio.bibliotheque_api.soap.request.RetournerLivreRequest;
import com.biblio.bibliotheque_api.soap.response.RetournerLivreResponse;

@Endpoint
public class LivreEndpoint {

    private static final String NAMESPACE_URI = "http://biblio.com/livre";

    @Autowired
    private LivreService livreService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "RetournerLivreRequest")
    @ResponsePayload
    public RetournerLivreResponse retournerLivre(@RequestPayload RetournerLivreRequest request) {
        // Récupérer le livre via le service
        Livre livre = livreService.getLivreById(request.getIdLivre());

        // Vérifier si le livre existe
        RetournerLivreResponse response = new RetournerLivreResponse();
        if (livre != null) {
            // Traitement si le livre existe, par exemple, changement de statut pour "retourné"
            livre.setDisponible(true);
            livre.setReserve(false);
            livreService.updateLivre(livre);  // Appeler la méthode de mise à jour

            response.setMessage("Le livre a été retourné avec succès.");
        } else {
            response.setMessage("Livre introuvable.");
        }
        return response;
    }
}
