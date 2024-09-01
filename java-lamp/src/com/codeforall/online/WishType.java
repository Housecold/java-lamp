package com.codeforall.online;

public enum WishType {
    WEALTH ("Wealth's bounty, a treasure to unfold with care,\n" +
            "In its abundance, dreams and hopes we share."),
    FAME ("Fame's embrace, a shining light to chase,\n" +
            "In the realm of stars, your legacy in grace."),
    LUCK ("Luck's gentle sway, in life's intricate lace,\n" +
            "Each twist and turn, a fortuitous embrace."),
    POOR ("Poor's blight, a weight too much to bear,\n" +
            "In its shadow, dreams vanish into thin air."),
    SICKNESS ("Sickness' curse, a dark and heavy air,\n" +
            "In its clutch, we're bound in despair."),
    BAD_LUCK ("Bad luck's shadow, a looming, chilling scare,\n" +
            "In its grip, fate's cruelty we bear.");

    private String description;

    private WishType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
