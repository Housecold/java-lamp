package com.codeforall.online;

public class FriendlyGenie extends Genie{

    public FriendlyGenie(int maxWishes) {
        super(maxWishes);
    }

    @Override
    public boolean grantWish(Wish wish) {
        if(this.isGoodWish(wish)) {
            return super.grantWish(wish);
        }
        System.out.println("FRIENDLY GENIE: You seem a great person to wish such bad things. I'm making sure you can only get good things!");
        return false;
    }
}
