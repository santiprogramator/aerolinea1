package com.example.aerolinea1.service;

import com.example.aerolinea1.Entity.VuelosVuelta;
import com.example.aerolinea1.repository.VueltaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VueltaServicempl implements VueltaService {


 VueltaRepository vueltaRepository;

        public VueltaServicempl(VueltaRepository AgendaRepository) {
            this.vueltaRepository = AgendaRepository;}
        public List<VuelosVuelta> getRegresos(String fechavuelta) {
            return vueltaRepository.findByFechaVuelta(fechavuelta);
        }

    }

