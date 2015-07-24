package com.whoisthat.grammars.english;

import com.whoisthat.GameTerminal;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.requireNonNull;

public enum EnglishTerminal {

    GREEN(GameTerminal.GREEN, "green"),
    BLUE(GameTerminal.BLUE, "blue"),
    BROWN(GameTerminal.BROWN, "brown"),
    BLACK(GameTerminal.BLACK, "black"),
    WHITE(GameTerminal.WHITE, "white"),
    BIG(GameTerminal.BIG, "big"),
    SMALL(GameTerminal.SMALL, "small"),
    CURLY(GameTerminal.CURLY, "curly"),
    STRAIGHT(GameTerminal.STRAIGHT, "straight"),
    WAVY(GameTerminal.WAVY, "wavy"),
    BLONDE(GameTerminal.BLONDE, "blonde"),
    RED(GameTerminal.RED, "red"),
    SHORT(GameTerminal.SHORT, "short"),
    BALD(GameTerminal.BALD, "bald"),
    MAN(GameTerminal.MAN, "a man", "he"),
    WOMAN(GameTerminal.WOMAN, "a woman", "she"),
    YOUNG(GameTerminal.YOUNG, "young"),
    OLD(GameTerminal.OLD, "old"),
    LONG(GameTerminal.LONG, "long"),
    FAT(GameTerminal.FAT, "fat"),
    SLIM(GameTerminal.SLIM, "slim"),
    ASIAN(GameTerminal.ASIAN, "asian"),
    INDIAN(GameTerminal.INDIAN, "indian"),
    GLASSES(GameTerminal.GLASSES, "glasses"),
    EARRINGS(GameTerminal.EARRINGS, "earrings"),
    LIPSTICK(GameTerminal.LIPSTICK, "lipstick"),
    HAT(GameTerminal.HAT, "a hat"),
    BEARD(GameTerminal.BEARD, "a beard"),
    MOUSTACHE(GameTerminal.MOUSTACHE, "a moustache"),
    EYES(GameTerminal.EYE, "eyes"),
    MOUTH(GameTerminal.MOUTH, "mouth"),
    NOSE(GameTerminal.NOSE, "nose"),
    HAIR(GameTerminal.HAIR, "hair"),
    RED_CHEEKS(GameTerminal.RED_CHEEKS, "red cheeks");

    public static GameTerminal getTerminal(String alias) {
        GameTerminal gameTerminal = Aliases.map.get(alias);
        requireNonNull(gameTerminal, String.format("Impossible to find a terminal for: %s in %s", alias, EnglishTerminal.class));
        return gameTerminal;
    }

    public String toString() {
        return name().toLowerCase();
    }

    EnglishTerminal(GameTerminal terminal, String... aliases) {
        for (String alias : aliases) {
            Aliases.map.put(alias.trim().toLowerCase(), terminal);
        }
    }

    private static final class Aliases {
        static final Map<String, GameTerminal> map = new HashMap<>();
    }
}
