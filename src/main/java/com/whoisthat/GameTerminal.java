package com.whoisthat;

public enum GameTerminal {

    //SUBJECT
    MAN("man"),
    WOMAN("woman"),

    //COLOR
    BROWN("color.brown"),
    BLACK("color.black"),
    WHITE("color.white"),
    GREEN("color.green"),
    BLUE("color.blue"),
    RED("color.red"),
    BLONDE("color.blonde"),

    //SIZE
    BIG("size.big"),
    SMALL("size.small"),
    SHORT("size.short"),
    LONG("size.long"),

    //ETHNICITY
    ASIAN("ethnicity.asian"),
    INDIAN("ethnicity.indian"),

    //CONSTITUTION
    FAT("constitution.fat"),
    SLIM("constitution.slim"),

    //HAIRDO
    CURLY("hairdo.curly"),
    STRAIGHT("hairdo.straight"),
    WAVY("hairdo.wavy"),
    BALD("hairdo.bald"),

    //AGE
    YOUNG("age.young"),
    OLD("age.old"),

    //TRAITS
    NOSE("trait.nose"),
    HAIR("trait.hair"),
    BEARD("trait.beard"),
    MOUSTACHE("trait.moustache"),
    EYE("trait.eyes"),
    MOUTH("trait.mouth"),
    RED_CHEEKS("trait.redcheeks"),

    //ACCESSORIES
    GLASSES("accessory.glasses"),
    EARRINGS("accessory.earrings"),
    LIPSTICK("accessory.lipstick"),
    HAT("accessory.hat");

    private String i18nKey;

    GameTerminal(String key) {
        this.i18nKey = key;
    }
}
