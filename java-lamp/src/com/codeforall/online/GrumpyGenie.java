package com.codeforall.online;

import java.util.Random;

public class GrumpyGenie extends Genie{
    private boolean recycled;
    private boolean lampDestroyed;
    private boolean wishGranted;
    private Random random;

    public GrumpyGenie(int maxWishes) {
        super(maxWishes);
        this.recycled = false;
        this.lampDestroyed = false;
        this.wishGranted = false;
        this.random = new Random();
    }

    @Override
    public boolean grantWish(Wish wish) {
        if(!wishGranted && !recycled) {
            if(random.nextBoolean()) {
                if(super.grantWish(wish)) {
                    this.wishGranted = true;
                    return true;
                }
            }
            System.out.println("GRUMPY GENIE: I'm too busy to grant this wish, sorry not sorry!");
            return false;
        }
        System.out.println("You can only grant one wish or you have recycled your Genie!");
        return false;
    }

    public void recycle(MagicLamp lamp) {
        if(!recycled) {
            recycled = true;
            lamp.recharge(this);
            System.out.println("Grumpy Genie recycled!");
            if(random.nextBoolean()) {
                lampDestroyed = true;
                System.out.println("The magic lamp is destroyed!");
            }
        }
    }
}
