package com.mohamed.nabil.projet.jee.Service.Impl;

import com.mohamed.nabil.projet.jee.Service.CommandeService;
import com.mohamed.nabil.projet.jee.model.Commande;
import com.mohamed.nabil.projet.jee.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeServiceImpl implements CommandeService {
    private final CommandeRepository repository;
    @Autowired
    public CommandeServiceImpl(CommandeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Commande> getCommandes() {
        return repository.findAll();
    }

    @Override
    public Optional<Commande> getCommandeById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void addCommande(Commande commande) {
        repository.save(commande);
    }

    @Override
    public void deleteCommande(Commande commande) {
        repository.delete(commande);
    }
}
