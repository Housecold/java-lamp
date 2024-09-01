package com.codeforall.online;

public class Demon extends Genie{
    private boolean recycled;

    public Demon(int maxWishes) {
        super(maxWishes);
        this.recycled = false;
    }

    @Override
    public boolean grantWish(Wish wish) {
        if(this.isBadWish(wish) && !recycled) {
            System.out.println(wish.getWishType().getDescription());
            return true;
        }
        System.out.println("DEMON: You fool! Only bad wishes for you!");
        return false;
    }

    public void recycle(MagicLamp lamp) {
        if(!recycled) {
            recycled = true;
            lamp.recharge(this);
            System.out.println("Demon recycled!");

        }
    }
}
