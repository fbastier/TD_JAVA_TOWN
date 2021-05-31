package com.bastier.tpJavaTown.model;

public class Cowboy extends Humain {
    private int populaire = 0;
    private String caracteristique = "vaillant";

    public Cowboy(String nom) {
        super(nom, "le whisky");
    }

    public Cowboy(String nom, String boissonFav) {
        super(nom, boissonFav);
    }

    public Cowboy(String nom, String boissonFav, String caracteristique) {
        super(nom, boissonFav);
        this.caracteristique = caracteristique;
    }

    public void tirer(Brigand brigand) {
        System.out.printf("Le %s %s tire sur %s. PAN !\n", this.caracteristique ,this.getNom(), brigand.getNom());
        System.out.println("\" Prend ça, rascal \"");
    }

    public void liberer(Dame dame) {
        System.out.printf("Come on Baby !");
        dame.etreLiberer();
        this.populaire++;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        if (populaire == 0) {
            System.out.printf("Les gens disent de moi que je suis %s mais je ne suis pas populaire", this.caracteristique);
        } else if (populaire < 5) {
            System.out.printf("Les gens disent de moi que je suis %s et je suis assez populaire", this.caracteristique);
        } else {
            System.out.printf("Les gens disent de moi que je suis %s et je suis très populaire", this.caracteristique);
        }
    }
}
