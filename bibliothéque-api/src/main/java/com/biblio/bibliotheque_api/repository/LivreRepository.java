package com.biblio.bibliotheque_api.repository;

import com.biblio.bibliotheque_api.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {
    List<Livre> findByDisponibleTrueAndReserveFalse();
}
