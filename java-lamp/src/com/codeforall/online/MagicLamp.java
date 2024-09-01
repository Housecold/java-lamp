package com.codeforall.online;

public class MagicLamp {
    private int maxGenies;
    private int remainingGenies;
    private int maxRecharges;
    private int remainingRecharges;
    private int timesRecharged;

    public MagicLamp(int maxGenies, int maxRecharges) {
        this.maxGenies = maxGenies;
        this.remainingGenies = maxGenies;
        this.maxRecharges = maxRecharges;
        this.remainingRecharges = maxRecharges;
        this.timesRecharged = 0;
    }

    public Genie rub(Genie genie) {
        if(this.remainingGenies > 0) {
            if(this.remainingGenies % 2 == 0) {
                System.out.println("A Friendly Genie appears!");
                this.remainingGenies--;
                return new FriendlyGenie(genie.getMaxWishes());
            } else {
                System.out.println("A Grumpy Genie appears!");
                this.remainingGenies --;
                return new GrumpyGenie(genie.getMaxWishes());
            }

        } else {
            System.out.println("A Demon appears!");
            return new Demon(genie.getMaxWishes());
        }
    }

    public void recharge(Genie genie) {
        if(this.remainingRecharges > 0) {
            System.out.println("The lamp is recharged!");
            this.remainingRecharges--;
            this.remainingGenies = maxGenies;
            this.timesRecharged++;
        } else {
            System.out.println("Cannot recharge anymore!");
        }
    }

    public boolean compareLamps(MagicLamp other) {
        if(this.maxGenies == other.maxGenies && this.remainingGenies == other.remainingGenies && this.timesRecharged == other.timesRecharged) {
            System.out.println("The lamps are equal!");
            return true;
        }
        System.out.println("The lamps are different!");
        return false;
    }
}