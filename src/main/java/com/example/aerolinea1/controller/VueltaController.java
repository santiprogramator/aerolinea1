package com.example.aerolinea1.controller;

import com.example.aerolinea1.Entity.Agenda;
import com.example.aerolinea1.Entity.VuelosVuelta;
import com.example.aerolinea1.service.AgendaService;
import com.example.aerolinea1.service.VueltaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api/vuelta")
public class VueltaController {
    VueltaService vueltasservice;


    @GetMapping("/getregreso")
    public ResponseEntity<VuelosVuelta> getRegresos(@RequestParam("fechavuelta") String fechaVuelta) {
        List<VuelosVuelta> vueltas = vueltasservice.getRegresos(fechaVuelta);
        return new ResponseEntity(vueltas, HttpStatus.OK);
    }
    //
}
