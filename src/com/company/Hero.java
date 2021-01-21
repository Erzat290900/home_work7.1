package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int healht;
    private int domage;
    private String typeAbility;

    public int getHealht() {
        return healht;
    }

    public void setHealht(int healht) {
        this.healht = healht;
    }

    public int getDomage() {
        return domage;
    }

    public void setDomage(int domage) {
        this.domage = domage;
    }

    public String getTypeAbility() {
        return typeAbility;
    }

    public void setTypeAbility(String typeAbility) {
        this.typeAbility = typeAbility;
    }


}
