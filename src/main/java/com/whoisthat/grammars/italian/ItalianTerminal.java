package com.whoisthat.grammars.italian;

import java.util.HashMap;
import java.util.Map;

public enum ItalianTerminal {

    GREEN("verde", "verdi"),
    BLUE("azzurri"),
    BROWN("marrone", "marroni", "castani"),
    BLACK("nero", "neri", "nera", "nere"),
    WHITE("bianco", "bianchi", "bianca", "bianche"),
    BIG("grande", "grandi"),
    SMALL("piccolo", "piccola", "piccole", "piccoli"),
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


    public static ItalianTerminal getTerminal(String alias) {
        return Aliases.map.get(alias);
    }

    public String toString() {
        return name().toLowerCase();
    }

    ItalianTerminal(String... aliases) {
        Aliases.map.put(this.name().trim().toLowerCase(), this);
        for (String alias : aliases) {
            Aliases.map.put(alias.trim().toLowerCase(), this);
        }
    }

    private static final class Aliases {
        static final Map<String, ItalianTerminal> map = new HashMap<>();
    }
}
