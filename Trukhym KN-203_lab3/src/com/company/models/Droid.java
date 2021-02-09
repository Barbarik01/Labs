package com.company.models;

public class Droid {
    private String name;
    private int health;
    private int damage;
    private int intelligence;

    public Droid(String name, int health, int damage,int intelligence) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.intelligence = intelligence;
    }
    public Droid(){
    }
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
    protected void buff(){
    }
}
