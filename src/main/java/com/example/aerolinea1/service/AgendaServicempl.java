package com.example.aerolinea1.service;

import com.example.aerolinea1.Entity.Agenda;

import com.example.aerolinea1.repository.AgendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaServicempl implements AgendaService {

    AgendaRepository agendaRepository;

    public AgendaServicempl(AgendaRepository AgendaRepository) {
        this.agendaRepository = AgendaRepository;}
        @Override
        public List<Agenda> getIda() {
            return agendaRepository.findAll();
        }


    }



