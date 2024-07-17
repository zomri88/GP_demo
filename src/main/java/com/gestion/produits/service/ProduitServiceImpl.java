package com.gestion.produits.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.produits.modele.Produit;
import com.gestion.produits.repository.ProduitRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class ProduitServiceImpl implements ProduitService{

	private final ProduitRepository produitRepository;
	
	@Override
	public Produit creer(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public List<Produit> lire() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Produit modifier(Long id, Produit produit) {
	    return produitRepository.findById(id)
	            .map(p -> {
	                p.setPrix(produit.getPrix());
	                p.setDescription(produit.getDescription());
	                p.setNom(produit.getNom());
	                return produitRepository.save(p);
	            })
	            .orElseThrow(() -> new RuntimeException("Produit non trouvé"));
	}


	@Override
	public String supprimer(Long id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);
		
		return "Produit supprimer";
	}

}
