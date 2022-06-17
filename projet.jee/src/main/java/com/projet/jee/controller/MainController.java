package com.mohamed.nabil.projet.jee.controller;

import com.mohamed.nabil.projet.jee.Service.CommandeService;
import com.mohamed.nabil.projet.jee.Service.ProduitService;
import com.mohamed.nabil.projet.jee.model.Commande;
import com.mohamed.nabil.projet.jee.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RequestMapping("")
@Controller
public class MainController {
    private final ProduitService produitService;
    private final CommandeService commandeService;
    @Autowired
    public MainController(ProduitService produitService, CommandeService commandeService) {
        this.produitService = produitService;
        this.commandeService = commandeService;
    }
    @GetMapping("/produits")
    public String getProduits(Model model){
        model.addAttribute("listProduit", produitService.getProduits());
        return "produit";
    }
    @GetMapping("/addProduit")
    public String addProduitForm(Model model){
        Produit produit = new Produit();
        model.addAttribute("produit", produit);
        return "ajouter_produit";
    }
    @PostMapping("/saveProduit")
    public String saveProduit(@ModelAttribute("produit") Produit produit){
        produitService.addProduit(produit);
        return "redirect:/produits";
    }
    @GetMapping("/modifier_produit_form/{id}")
    public String modifierProduitForm(@PathVariable(value = "id") Long id, Model model ){
        Produit produit = produitService.getProduitById(id);
        model.addAttribute("produit", produit);
        return "modifier_produit";
    }
    @GetMapping("/supprimer_produit/{id}")
    public String supprimerProduit(@PathVariable(value = "id") Long id){
        produitService.deleteProduit(id);
        return "redirect:/produits";
    }

    @GetMapping("/commandes")
    public String getproduits(Model model){
        model.addAttribute("listCommande", commandeService.getCommandes());
        return "commande";
    }

    @GetMapping("/add_commande/{id}")
    public String addCommandeForm(@PathVariable(value = "id") Long id, Model model){
        Commande commande = new Commande();
        Produit produit = produitService.getProduitById(id);
        System.out.println("produit = " + produit);
        commande.setProduit(produit);
        System.out.println("commande.getProduit() = " + commande.getProduit());
        model.addAttribute("commande", commande);
        return "ajouter_commande";
    }
    @PostMapping("/saveCommande")
    public String saveProduit(@ModelAttribute("commande") Commande commande){
        commandeService.addCommande(commande);
        System.out.println("commande.getProduit() = " + commande.getProduit());
        return "redirect:/commandes";
    }
}
