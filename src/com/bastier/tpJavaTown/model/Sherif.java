package com.bastier.tpJavaTown.model;

import com.bastier.tpJavaTown.model.Brigand;
import com.bastier.tpJavaTown.model.Cowboy;

public class Sherif extends Cowboy {


    public Sherif(String nom) {
        super(nom);
    }

    public Sherif(String nom, String boissonFav) {
        super(nom, boissonFav);
    }

    public void coffrer(Brigand brigand) {
        System.out.println("Au nom de la loi, je vous arrête !");
        brigand.emprisonner(this);
    }

    public void rechercher(Brigand brigand) {
        System.out.printf("OYEZ OYEZ BRAVE GENS, %d $ à qui arretera %s ");
    }
}
