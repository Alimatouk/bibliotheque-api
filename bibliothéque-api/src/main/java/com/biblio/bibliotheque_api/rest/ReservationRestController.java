package com.biblio.bibliotheque_api.rest;

import com.biblio.bibliotheque_api.model.Reservation;
import com.biblio.bibliotheque_api.repository.ReservationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
public class ReservationRestController {

    private final ReservationRepository reservationRepository;

    public ReservationRestController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    // GET /reservations
    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    // GET /reservations/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable Long id) {
        Optional<Reservation> res = reservationRepository.findById(id);
        return res.map(ResponseEntity::ok)
                  .orElse(ResponseEntity.notFound().build());
    }

    // POST /reservations
    @PostMapping
    public ResponseEntity<String> createReservation(@RequestBody Reservation reservation) {
        reservationRepository.save(reservation);
        return ResponseEntity.ok("Réservation créée");
    }
}
