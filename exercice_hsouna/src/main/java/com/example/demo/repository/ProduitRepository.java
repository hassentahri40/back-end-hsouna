package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.Produit;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long> {

}
