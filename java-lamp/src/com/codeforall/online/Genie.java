package com.codeforall.online;

public class Genie {
    private int maxWishes;
    private int remainingWishes;

    public Genie (int maxWishes) {
        this.maxWishes = maxWishes;
        this.remainingWishes = maxWishes;
    }

    public boolean isGoodWish(Wish wish) {
        return wish.getWishType().equals(WishType.WEALTH) || wish.getWishType().equals(WishType.LUCK) || wish.getWishType().equals(WishType.FAME);
    }

    public boolean isBadWish(Wish wish) {
        return wish.getWishType().equals(WishType.POOR) || wish.getWishType().equals(WishType.SICKNESS) || wish.getWishType().equals(WishType.BAD_LUCK);
    }

    public boolean grantWish(Wish wish) {
        if(remainingWishes > 0) {
            System.out.println(wish.getWishType().getDescription());
            remainingWishes --;
            return true;
        } else {
            System.out.println("You reached the maximum amount of wishes you can get!");
            return false;
        }
    }

    public int getMaxWishes() {
        return maxWishes;
    }
}
