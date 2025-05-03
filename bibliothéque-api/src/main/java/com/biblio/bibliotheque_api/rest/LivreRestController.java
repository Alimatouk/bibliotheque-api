package com.biblio.bibliotheque_api.rest;

import com.biblio.bibliotheque_api.model.Livre;
import com.biblio.bibliotheque_api.repository.LivreRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreRestController {

    private final LivreRepository livreRepository;

    public LivreRestController(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    // GET /livres
    @GetMapping
    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    // GET /livres/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Livre> getLivreById(@PathVariable Long id) {
        return livreRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET /livres/disponibles
    @GetMapping("/disponibles")
    public List<Livre> getLivresDisponibles() {
        return livreRepository.findByDisponibleTrueAndReserveFalse();
    }
}
