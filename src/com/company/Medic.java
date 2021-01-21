package com.company;

public class Medic extends Hero {
    @Override
    public String applySuperType(String superAbilityType) {
        return "Medic применил суперспособность "+ superAbilityType;
    }
}
