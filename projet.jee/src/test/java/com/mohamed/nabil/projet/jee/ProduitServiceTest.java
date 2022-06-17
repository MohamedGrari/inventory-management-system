package com.mohamed.nabil.projet.jee;

import com.mohamed.nabil.projet.jee.Service.CommandeService;
import com.mohamed.nabil.projet.jee.Service.ProduitService;
import com.mohamed.nabil.projet.jee.model.Produit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class ProduitServiceTest {
    @Autowired
    private ProduitService produitService;
    @Test
    public void saveProduit(){
        Produit produit = Produit.builder()
                        .nom("Croustina").prix(BigDecimal.valueOf(15.5)).stock(30).build();
        produitService.addProduit(produit);
    }
}
