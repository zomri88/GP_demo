package com.gestion.produits.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="Produit")
@Getter
@Setter
@NoArgsConstructor
public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private long id;
@Column(length=50)
private String nom;
@Column(length=50)
private String description;
private Integer prix;

}
