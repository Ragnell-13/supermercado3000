package com.company;

public class Utils {
    private static final String []NAMES = {
            "Goncho",
            "Carlitos",
            "Natasha",
            "Robertin",
            "Rasputin",
            "Rey Misterio",
            "Baptista",
            "El Enterrador",
            "Barney",
            "Yogi",
            "Lobezno",
            "Bonney M",
            "Pitufin",
            "Xehanort",
            "Batman"
    };

    public static String generateName() {
        int index = (int) (Math.random() * NAMES.length);
        return NAMES[index];
    };




}
