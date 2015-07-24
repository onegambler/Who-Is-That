package com.whoisthat.grammars.italian;

import com.whoisthat.GameTerminal;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

public enum ItalianTerminal {

    GREEN(GameTerminal.GREEN, "verde", "verdi"),
    BLUE(GameTerminal.BLUE, "azzurri"),
    BROWN(GameTerminal.BROWN, "marrone", "marroni", "castani"),
    BLACK(GameTerminal.BLACK, "nero", "neri", "nera", "nere"),
    WHITE(GameTerminal.WHITE, "bianco", "bianchi", "bianca", "bianche"),
    BIG(GameTerminal.BIG, "grande", "grandi"),
    SMALL(GameTerminal.SMALL, "piccolo", "piccola", "piccole", "piccoli"),
    CURLY(GameTerminal.CURLY, "ricci"),
    STRAIGHT(GameTerminal.STRAIGHT, "lisci"),
    WAVY(GameTerminal.WAVY, "mossi"),
    BLONDE(GameTerminal.BLONDE, "biondi"),
    RED(GameTerminal.RED, "rossi"),
    SHORT(GameTerminal.SHORT, "corta", "corto", "corti", "corte"),
    BALD(GameTerminal.BALD, "calvo", "calva", "pelato", "pelata"),
    MAN(GameTerminal.MAN, "uomo", "maschio"),
    WOMAN(GameTerminal.WOMAN, "donna", "femmina"),
    YOUNG(GameTerminal.YOUNG, "giovane"),
    OLD(GameTerminal.OLD, "vecchio", "vecchia"),
    LONG(GameTerminal.LONG, "lungo", "lunghi", "lunghe", "lunga"),
    FAT(GameTerminal.FAT, "grasso", "grassa"),
    SLIM(GameTerminal.SLIM, "magro", "magra"),
    ASIAN(GameTerminal.ASIAN, "asiatico", "asiatica"),
    INDIAN(GameTerminal.INDIAN, "indiano", "indiana"),
    GLASSES(GameTerminal.GLASSES, "gli occhiali"),
    EARRINGS(GameTerminal.EARRINGS, "gli orecchini"),
    LIPSTICK(GameTerminal.LIPSTICK, "il rossetto"),
    HAT(GameTerminal.HAT, "il cappello"),
    BEARD(GameTerminal.BEARD, "la barba"),
    MOUSTACHE(GameTerminal.MOUSTACHE, "i baffi"),
    EYES(GameTerminal.EYE, "gli occhi"),
    MOUTH(GameTerminal.MOUTH, "la bocca"),
    NOSE(GameTerminal.NOSE, "il naso"),
    RED_CHEEKS(GameTerminal.RED_CHEEKS, "le guance rosse"),;

    public static GameTerminal getTerminal(String alias) {
        GameTerminal gameTerminal = Aliases.map.get(alias);
        requireNonNull(gameTerminal, String.format("Impossible to find a terminal for: %s in %s", alias, ItalianTerminal.class));
        return gameTerminal;
    }

    public String toString() {
        return name().toLowerCase();
    }

    ItalianTerminal(GameTerminal terminal, String... aliases) {
        for (String alias : aliases) {
            Aliases.map.put(alias.trim().toLowerCase(), terminal);
        }
    }

    private static final class Aliases {
        static final Map<String, GameTerminal> map = new HashMap<>();
    }
}
