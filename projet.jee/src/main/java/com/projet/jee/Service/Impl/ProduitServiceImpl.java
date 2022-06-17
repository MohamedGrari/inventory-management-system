package com.mohamed.nabil.projet.jee.Service.Impl;

import com.mohamed.nabil.projet.jee.Service.ProduitService;
import com.mohamed.nabil.projet.jee.model.Produit;
import com.mohamed.nabil.projet.jee.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImpl implements ProduitService {
    private final ProduitRepository repository;
    @Autowired
    public ProduitServiceImpl(ProduitRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Produit> getProduits() {
        return repository.findAll();
    }

    @Override
    public List<Produit> getProduitByName(String name) {
        return repository.findByNomContainingIgnoreCase(name);
    }

    @Override
    public Produit getProduitById(Long id) {
        Optional<Produit> optional = repository.findById(id);
        Produit produit = null;
        if(optional.isPresent()){
            produit = optional.get();
        } else{
            throw new RuntimeException("Produit non trouve");
        }
        return produit;
    }

    @Override
    public void addProduit(Produit produit) {
        repository.save(produit);
    }

    @Override
    public void deleteProduit(Long id) {
        repository.deleteById(id);
    }
}
