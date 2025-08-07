package com.liantsoa;

import java.util.Date;

public class MatchAmical extends Match{
    public MatchAmical(int id, Date date, char endroit) {
        super(id, date, endroit);
    }
    @Override
    public TypesMatch getMatchAmical(){
        return TypesMatch.AMICAUX;
    }

    @Override
    public void terminer(){
        super.terminer();

    }
}
