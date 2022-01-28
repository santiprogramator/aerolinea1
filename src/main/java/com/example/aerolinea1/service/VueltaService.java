package com.example.aerolinea1.service;

import com.example.aerolinea1.Entity.VuelosVuelta;

import java.util.List;

public interface VueltaService {
    List<VuelosVuelta> getRegresos(String fechaVuelta);
}
