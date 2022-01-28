package com.example.aerolinea1.controller;

import com.example.aerolinea1.Entity.Agenda;
import com.example.aerolinea1.Entity.VuelosVuelta;
import com.example.aerolinea1.service.AgendaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/Agenda")
public class AgendaController {


    AgendaService agendaService;

    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @GetMapping("/getfechaida")
        public ResponseEntity<Agenda> getIda() {
            List<Agenda> agendas = agendaService.getIda();
            return new ResponseEntity(agendas, HttpStatus.OK);
        }

}

