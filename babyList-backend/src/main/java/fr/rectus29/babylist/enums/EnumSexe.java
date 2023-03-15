package fr.rectus29.babylist.enums;

public enum EnumSexe {
    MASCULIN("Garçon"), FEMININ("Fille"),BOTH("Les deux");

    private String label;

    EnumSexe(String label) {
        this.label = label;
    }
}
