package org.fstt.lsi.thymeleaf.web;

import org.fstt.lsi.thymeleaf.dao.ProduitRepository;
import org.fstt.lsi.thymeleaf.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProduitController {
    @Autowired
    private ProduitRepository produitRepository;
    @GetMapping(path="/index")
    private String index() {
        return "index";
    }
    @GetMapping(path="/products")
    private String products(Model model) {
        List<Produit> produits=produitRepository.findAll();
        model.addAttribute("listProduits", produits);
        return "products";
    }
}