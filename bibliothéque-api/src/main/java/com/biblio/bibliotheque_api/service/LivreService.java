package com.biblio.bibliotheque_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.bibliotheque_api.model.Livre;
import com.biblio.bibliotheque_api.repository.LivreRepository;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;

    public Livre ajouterLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    public Livre getLivreById(Long id) {
        return livreRepository.findById(id).orElse(null);
    }

    // Ajouter la méthode de mise à jour
    public Livre updateLivre(Livre livre) {
        return livreRepository.save(livre);  // Cette méthode permet de mettre à jour le livre dans la base de données
    }
}
