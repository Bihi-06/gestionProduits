package org.fstt.lsi.thymeleaf.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="PRODUIT")
public class Produit {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String designation;
    private double prix;
    private double quantite;
    @Override
    public String toString() {
        return "Produit [id=" + id + ", designation=" + designation + ", prix=" + prix + ", quantite=" + quantite + "]";
    }
    public Produit() {
        super();
// TODO Auto-generated constructor stub
    }
    public Produit(Long id, String designation, double prix, double quantite) {
        super();
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public double getQuantite() {
        return quantite;
    }
    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
}