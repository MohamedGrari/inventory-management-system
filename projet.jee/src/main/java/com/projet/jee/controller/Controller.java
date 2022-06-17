package com.mohamed.nabil.projet.jee.controller;

//
//@RequestMapping("/api")
//@RestController
//public class Controller {
//    private final ProduitService produitService;
//    private final CommandeService commandeService;
//    private final TicketService ticketService;
//    @Autowired
//    public Controller(ProduitService produitService, CommandeService commandeService, TicketService ticketService) {
//        this.produitService = produitService;
//        this.commandeService = commandeService;
//        this.ticketService = ticketService;
//    }
//
//    @GetMapping("/produits")
//    public List<Produit> getProduits(){
//        return produitService.getProduits();
//    }
//    @GetMapping("/produits/id/{id}")
//    public Optional<Produit> getProduitById(@PathVariable("id") Long id){
//        return produitService.getProduitById(id);
//    }
//    @GetMapping("/produits/name/{name}")
//    public List<Produit> getProduitByName(@PathVariable("name") String name){
//        return produitService.getProduitByName(name);
//    }
//    @DeleteMapping("/produit")
//    public void deleteProduit(@RequestBody Produit produit){
//        produitService.deleteProduit(produit);
//    }
//    @PostMapping("/produit")
//    public void saveChien (@RequestBody Produit produit){
//        produitService.addProduit(produit);
//    }
//}
