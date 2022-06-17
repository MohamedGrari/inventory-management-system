package com.mohamed.nabil.projet.jee.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int quantite;
    @CreatedDate
    private Instant dateCreation;
    @ManyToOne
    @JoinColumn(name = "produit_ID")
    private Produit produit;

}
