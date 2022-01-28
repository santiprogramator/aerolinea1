package com.example.aerolinea1.repository;

import com.example.aerolinea1.Entity.Agenda;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgendaRepository extends JpaRepository<Agenda, Integer> {
    List<Agenda> findAll();
}
