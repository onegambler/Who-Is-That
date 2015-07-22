package com.whoisthat.tools;

import java.util.HashMap;
import java.util.Map;

public enum ItalianTerminals {

    GREEN("verde", "verdi"),
    BLUE("azzurri"),
    BROWN("marrone", "marroni", "castani"),
    BLACK("nero", "neri", "nera", "nere"),
    WHITE("bianco", "bianchi", "bianca", "bianche"),
    BIG("grande", "grandi"),
    ABIG,
    SMALL("piccolo", "piccola", "piccole", "piccoli"),
    ASMALL,
    CURLY("ricci"),
    STRAIGHT("lisci"),
    WAVY("mossi"),
    BLONDE("biondi"),
    RED("rossi"),
    SHORT("corta", "corto", "corti", "corte"),
    BALD("calvo", "calva"),
    MAN("uomo", "maschio"),
    WOMAN("donna", "femmina"),
    YOUNG("giovane"),
    OLD("vecchio", "vecchia"),
    LONG("lungo", "lunghi", "lunghe", "lunga"),
    FAT("grasso", "grassa"),
    SLIM("magro", "magra"),
    ASIAN("asiatico", "asiatica"),
    INDIAN("indiano", "indiana"),
    GLASSES("gli occhiali"),
    EARRINGS("gli orecchini"),
    LIPSTICK("il rossetto"),
    HAT("il cappello"),
    BEARD("la barba"),
    MOUSTACHE("i baffi");

    private static final int HASHMAPSIZE = 21;

    public static ItalianTerminals valueOfAlias(String alias) {
        ItalianTerminals constant = Aliases.map.get(alias.trim().toLowerCase());
        if (constant == null) {
            throw new IllegalArgumentException("undefined constant for: "
                    + alias);
        }
        return constant;
    }

    public String toString() {
        return name().toLowerCase();
    }

    ItalianTerminals(String... aliases) {
        Aliases.map.put(this.name().trim().toLowerCase(), this);
        for (String alias : aliases) {
            Aliases.map.put(alias.trim().toLowerCase(), this);
        }
    }

    private static final class Aliases {
        static final Map<String, ItalianTerminals> map = new HashMap<>(HASHMAPSIZE);
    }
}
