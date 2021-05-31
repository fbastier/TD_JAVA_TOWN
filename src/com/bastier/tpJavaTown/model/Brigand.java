package com.bastier.tpJavaTown.model;

public class Brigand extends Humain {
    private String look = "méchant";
    private int nbOtages = 0;
    private int recompense = 100;
    private boolean enPrison = false;

    Brigand(String nom, String boissonFav, String look, int nbOtages, int recompense, boolean enPrison) {
        super(nom, boissonFav);
        this.look = look;
        this.nbOtages = nbOtages;
        this.recompense = recompense;
        this.enPrison = enPrison;
    }

    public Brigand(String nom) {
        super(nom, "tord-boyaux");
    }

    public void kidnapper(Dame dame) {
        if (enPrison == false) {
            System.out.printf("Ah ah ! %s, tu est mienne désormais !", dame.getNom());
            dame.etreKidnapper();
        } else {
            System.out.printf("%s est en prison", this.getNom());
        }
    }

    public void emprisonner(Cowboy cowboy) {
        if (enPrison == false) {
            System.out.printf("Damned je suis fait! %s, tu m'a eu !", cowboy.getNom());
            //dame.etreKidnapper();
            this.enPrison = true;
        } else {
            System.out.printf("%s - je suis déjà en prison !", this.getNom());
        }
    }

    @Override
    public void quelEstTonNom() {
        System.out.printf("Le %s %s", this.look, this.getNom());
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        System.out.printf("(%s) - J'ai l'air %s et j'ai capturé %d dames !\n", this.getNom(), this.look, this.nbOtages);
        System.out.printf("(%s) - Ma tête est mise à prix %d $ !\n", this.getNom(), this.getRecompense());
    }

    public int getRecompense() {
        return recompense;
    }
}
