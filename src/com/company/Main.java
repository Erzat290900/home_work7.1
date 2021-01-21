package com.company;

public class Main {



    public static void main(String[] args) {
        HavingSuperAbility[] Having = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i <Having.length ; i++) {
            haveAll(Having[i]);

        }
    }

    public static void haveAll(HavingSuperAbility H) {
        System.out.println(H.applySuperType("Critical Demage"));

    }
}
