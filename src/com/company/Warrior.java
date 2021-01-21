package com.company;

public class Warrior extends Hero {
    @Override
    public String applySuperType(String superAbilityType) {
        return "Warrior применил суперспособность "+ superAbilityType;
    }
}
