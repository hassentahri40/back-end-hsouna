package com.example.demo.service;

import com.example.demo.model.entity.Produit;

public interface ProduitService {
	Produit addproduit(Produit produit) ;
	Produit getbyid(long id);
	Produit editproduit(long id , Produit produit);
	void deleteproduit(Long id);
}
