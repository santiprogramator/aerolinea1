package com.example.aerolinea1.repository;

import com.example.aerolinea1.Entity.Agenda;
import com.example.aerolinea1.Entity.VuelosVuelta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VueltaRepository extends JpaRepository<VuelosVuelta, Integer> {
    List<VuelosVuelta> findByFechaVuelta(String fechaVuelta);
}
