package com.example.demo.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude 

public class ProduitDto {
	private long id;
	private String libelle ;
	private String couleur ;
	private int taille;
	

}
