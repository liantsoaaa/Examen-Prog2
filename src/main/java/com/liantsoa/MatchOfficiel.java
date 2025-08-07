package com.liantsoa;

import java.util.Date;

public class MatchOfficiel extends Match{
    public MatchOfficiel(int id, Date date, char endroit) {
        super(id, date, endroit);
    }

    @Override
    public TypesMatch getMatchOfficiel(){
        return TypesMatch.OFFICIELS;
    }

    @Override
    public void terminer(){
        super.terminer();
        Palmares palmares = new Palmares(0,0,0);
        nom
    }

}
