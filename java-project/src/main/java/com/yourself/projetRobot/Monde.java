package com.yourself.projetRobot;

public class Monde {
    private int longueur;
    private int largeur;
    private int plateau [][];

    public Monde(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.init();
    }

    void init() {

        plateau = new int[longueur][];
        for (int i =0 ; i < longueur; i++){
            plateau[i] = new int[largeur];
            for (int j=0; j < largeur ; j++)
                plateau[i][j] = -1;
        }




    }

    public Monde() {

        this.init();
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
        plateau = new int[longueur][];

    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
        for (int []tab:plateau) {
            tab = new int[largeur];
        }
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public String toString() {
        String res ="";
        for (int []tab:plateau
                ) {
            for (int v :tab
                    ) {
                res = res + v + " ";

            }
            res = res + "\n";
        }
        return res;
    }
}
