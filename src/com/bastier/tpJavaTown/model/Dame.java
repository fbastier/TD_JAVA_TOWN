package com.bastier.tpJavaTown.model;

import com.bastier.tpJavaTown.model.Humain;

public class Dame extends Humain {
    private String couleurRobe;
    private boolean libre;

    Dame(String nom,  String couleurRobe) {
        super(nom, "lait");
        this.couleurRobe = couleurRobe;
        this.libre = true;
    }

    Dame(String nom, String boisson,  String couleurRobe) {
        super(nom, boisson);
        this.couleurRobe = couleurRobe;
        this.libre = true;
    }

    public void etreKidnapper() {
        System.out.printf("AU SECOURS !!");
        this.libre = false;
    }

    public void etreLiberer() {
        System.out.printf("Oh mon héros !!");
        this.libre = true;
    }

    public void changerRobe(String couleurRobe) {
        this.couleurRobe = couleurRobe;
        System.out.printf("Regardez ma jolie robe %s", this.couleurRobe);
    }

    @Override
    public void quelEstTonNom() {
        System.out.printf("Miss %s", this.getNom());
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        System.out.printf("Regardez ma jolie robe %s", this.couleurRobe);
    }
}
