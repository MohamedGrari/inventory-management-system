package com.mohamed.nabil.projet.jee.model;

import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;


@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private BigDecimal prix;
    private int stock;
    private String categorie;

}
