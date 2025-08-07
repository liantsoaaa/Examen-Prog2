package com.liantsoa;

import java.util.ArrayList;

public class Combattant {
    private String id;
    private String nom;
    private String prenom;
    private String nomCombattant;
    private int poids;
    private ArrayList<String> titres = new ArrayList<>();

    public Combattant(String id, String nom, String prenom, String nomCombattant, int poids) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.poids = poids;
    }

    public String getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getNomCombattant() {
        return nomCombattant;
    }

}
