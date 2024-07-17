package com.gestion.produits.service;

import java.util.List;

import com.gestion.produits.modele.Produit;

public interface ProduitService {
	
	Produit creer(Produit produit);
	List<Produit> lire();
	Produit modifier(Long id, Produit produit);
	//String supprimer(Long id, Produit produit);
	String supprimer(Long id);

}
