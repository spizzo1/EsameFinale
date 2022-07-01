package com.example.esamefinale.restController;

import com.example.esamefinale.entity.Articolo;
import com.example.esamefinale.service.ArticoloService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/articolo")
public class ArticoloRestController {

    @Autowired
    ArticoloService articoloService;


    @GetMapping (value = "/listaArticoli")
    List<Articolo> listaArticoli(){

        return articoloService.listaArticoli();
    }

    @PostMapping(value="/creaArticolo")
    public String creaArticolo(@RequestBody Articolo articolo){

        articoloService.save(articolo);
        return "articolo salvato";
    }

    @PutMapping(value="/modificaArticolo")
    public String modificaArticolo(@RequestBody Articolo articolo) {

        if ((Object) articoloService.findById(articolo.getIdArticolo()) != null && articolo.getIdArticolo() != null)
            articoloService.save(articolo);
        return "articolo modificato";
    }

    @GetMapping(value = "/eliminaArticolo")
    void eliminaArticolo(@RequestParam long id) {
        Articolo articolo = articoloService.findArticolo(id);
        articoloService.delete(articolo);
    }
}