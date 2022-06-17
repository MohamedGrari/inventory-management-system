package com.mohamed.nabil.projet.jee.Service;

import com.mohamed.nabil.projet.jee.model.Commande;

import java.util.List;
import java.util.Optional;

public interface CommandeService {
    List<Commande> getCommandes();
    Optional<Commande> getCommandeById(Long id);
    void addCommande(Commande commande);
    void deleteCommande(Commande commande);
}
