package com.example.esamefinale.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Articolo")
public class Articolo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long idArticolo;

    @Column
    private String nome;

    @Column
    private double prezzo;

    @OneToMany
    @JoinTable(name = "ArticoloRecensione", joinColumns = {@JoinColumn(name = "IdArticolo")})
    private List<Recensione> recensioni = new ArrayList<Recensione>();

}