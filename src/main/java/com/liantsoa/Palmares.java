package com.liantsoa;

public class Palmares {
    private int nombreVictoires = 0;
    private int nombreDefaites = 0;
    private int nombreEgalites = 0;

    public Palmares(int nombreVictoires, int nombreDefaites, int nombreEgalites) {
        this.nombreVictoires = nombreVictoires;
        this.nombreDefaites = nombreDefaites;
        this.nombreEgalites = nombreEgalites;
    }

    public int getNombreVictoires() {
        return nombreVictoires;
    }

    public int getNombreDefaites() {
        return nombreDefaites;
    }

    public int getNombreEgalites() {
        return nombreEgalites;
    }
}
