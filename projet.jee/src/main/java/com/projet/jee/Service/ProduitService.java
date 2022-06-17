package com.mohamed.nabil.projet.jee.Service;

import com.mohamed.nabil.projet.jee.model.Produit;

import java.util.List;

public interface ProduitService {
    List<Produit> getProduits();
    List<Produit> getProduitByName(String name);
    Produit getProduitById(Long id);
    void addProduit(Produit produit);
    void deleteProduit(Long id);
}
