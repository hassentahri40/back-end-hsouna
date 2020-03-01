package com.example.demo.rest.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entity.Produit;
import com.example.demo.rest.dto.ProduitDto;
import com.example.demo.service.ProduitService;



@RestController
@CrossOrigin
public class ProduitController {
	
	@Autowired
	private ProduitService produitService ;
	@Autowired 
	private ModelMapper modelmapper;
	
	@PostMapping("/produit/{id}")
	public Object addproduit(@RequestBody ProduitDto produitdto , @PathVariable Long id)
	{Produit produit = ModelMapper.map(produitdto , Produit.class )
	}
	
	@GetMapping("/produit/{id}")
	public Object getById (@PathVariable Long id)
	{Produit produit = produitService.getbyid(id);
	 ProduitDto produitdto = modelmapper.map(produit , ProduitDto.class);
	 return ResponseEntity.status(HttpStatus.OK).body(produitdto);
	 
	 }

}
