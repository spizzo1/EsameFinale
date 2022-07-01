package com.example.esamefinale.repository;

import com.example.esamefinale.entity.Articolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArticoloRepository extends JpaRepository<Articolo,Long> {



}
