package com.bastier.tpJavaTown.model;

public class Humain {
    private String nom;
    private String boissonFav;

    public Humain(String nom) {
        this.nom = nom;
        this.boissonFav = "l'eau";
    }

    public Humain(String nom, String boissonFav) {
        this.nom = nom;
        this.boissonFav = boissonFav;
    }

    public void parle(String texte) {
        System.out.printf("%s - %s\n", nom, texte);
    }

    public void sePresenter() {
        System.out.printf("(%s) - Bonjour, je me nomme %s et ma boisson favorite est le %s.\n", this.nom, this.nom, this.boissonFav);
    }

    public void boire() {
        System.out.printf("(%s) - Ah ! un bon verre de %s ! GLOUPS !\n",this.nom, this.boissonFav);
    }

    public void quelEstTonNom() {
        System.out.printf("%s", this.getNom());
    }

    public String getNom() {
        return nom;
    }
}
