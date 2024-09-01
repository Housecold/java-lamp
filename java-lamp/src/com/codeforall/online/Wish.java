package com.codeforall.online;

public class Wish {
    private String wish;
    private WishType wishType;

    public Wish(String wish, WishType wishType) {
        this.wish = wish;
        this.wishType = wishType;
    }

    public WishType getWishType() {
        return wishType;
    }
}
