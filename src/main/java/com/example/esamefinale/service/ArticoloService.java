package com.example.esamefinale.service;

import com.example.esamefinale.entity.Articolo;

import java.util.List;
import java.util.Optional;

public interface ArticoloService {
    List<Articolo> listaArticoli();

    void save(Articolo articolo);

    Articolo findArticolo(long id);

    void delete(Articolo articolo);


    Optional<Articolo> findById(Long id);
}