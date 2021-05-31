package com.bastier.tpJavaTown.model;

import com.bastier.tpJavaTown.model.Humain;

public class Barman extends Humain {
    private String bar;

    public Barman(String nom) {
        super(nom, "vin");
        this.bar = "Chez " + nom;
    }

    public Barman(String nom, String bar) {
        super(nom, "vin");
        this.bar = bar;
    }

    private static boolean sortOfH(Object obj, String str) throws ClassNotFoundException {
        return Class.forName(str).isInstance(obj);
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        System.out.printf("Mon établissement est %s, coco !", this.bar);
    }

    public void servir(Humain humain) throws ClassNotFoundException {
        if(sortOfH(humain, "Brigand") == true) {
            // TODO implementer méthode servir
        }
    }
}
