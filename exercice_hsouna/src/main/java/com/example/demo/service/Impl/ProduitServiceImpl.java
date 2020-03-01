package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.entity.Produit;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.service.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	private ProduitRepository produitRepository;
	
	

	@Override
	public Produit addproduit(Produit produit) {
		return produitRepository.save(produit);
		
	}

	@Override
	public Produit getbyid(long id) {
		
		return produitRepository.findById(id).get();
	}

	@Override
	public Produit editproduit(long id, Produit produit) {
		getbyid(id);
		produit.setId(id);
		return produitRepository.save(produit);
		
		
	}

	@Override
	public void deleteproduit(Long id) {
		produitRepository.deleteById(id);
		
	}
}
