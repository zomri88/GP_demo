package com.gestion.produits.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.produits.modele.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long>{

}
