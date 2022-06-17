package com.mohamed.nabil.projet.jee.repository;

import com.mohamed.nabil.projet.jee.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    List<Produit> findByNomContainingIgnoreCase(String nom);
    void deleteById(Long id);
}
