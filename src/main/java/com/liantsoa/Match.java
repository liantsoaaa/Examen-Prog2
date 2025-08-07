package com.liantsoa;

import java.util.Date;

public class Match {
    private int id;
    private Date date;
    private char endroit;
    private Combattant combattant1;
    private Combattant combattant2;

    public Match(int id, Date date, char endroit) {
        this.id = id;
        this.date = date;
        this.endroit = endroit;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public char getEndroit() {
        return endroit;
    }

    public Combattant getCombattant1() {
        return combattant1;
    }

    public Combattant getCombattant2() {
        return combattant2;
    }

    public TypesMatch getMatchAmical(){
        return TypesMatch.AMICAUX;
    }

    public TypesMatch getMatchOfficiel(){
        return TypesMatch.OFFICIELS;
    }

    public TypesMatch getMatchTitre(){
        return TypesMatch.TITRE;
    }

    public void terminer(){
        int totalPoints = 0;
        if(this.getMatchAmical().equals(TypesMatch.AMICAUX)){
            totalPoints++;
        }


    }
}
