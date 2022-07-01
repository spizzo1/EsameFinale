package com.example.esamefinale.service;

import com.example.esamefinale.entity.Articolo;
import com.example.esamefinale.repository.ArticoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticoloServiceImpl implements ArticoloService {


    @Autowired
    ArticoloRepository articoloRepository;

    @Override
    public List<Articolo> listaArticoli() {
        return articoloRepository.findAll();
    }

    @Override
    public void save(Articolo articolo) {
        articoloRepository.save(articolo);
        System.out.println("articolo salvato correttamente");
    }


    @Override
    public Articolo findArticolo(long id) {
        Articolo articolo = articoloRepository.getById(id);
        return articolo;
    }


    @Override
    public void delete(Articolo docente) {
        articoloRepository.delete(docente);
        System.out.println("articolo eliminato correttamente");
    }



    @Override
    public Optional<Articolo> findById(Long id){
        return articoloRepository.findById(id);
    }
}