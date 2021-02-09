package com.company.models;

public class ScientistDroid extends Droid {
    private String rank = "junior";

    public ScientistDroid(String name, int health, int damage, int intelligence, String rank) {
        super(name, health, damage, intelligence);
        this.rank = rank;
        buff();
    }
    public ScientistDroid() {
    }
    @Override
    protected void buff(){
        int oldIntelligence = super.getIntelligence();
        if(rank.equals("junior"))
            super.setIntelligence(oldIntelligence+ 10);
        if(rank.equals("middle"))
            super.setIntelligence(oldIntelligence + 20);
        if(rank.equals("senior"))
            super.setIntelligence(oldIntelligence + 30);
    }
}
