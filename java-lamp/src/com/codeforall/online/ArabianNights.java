package com.codeforall.online;

public class ArabianNights {
    public static void main(String[] args) {
        MagicLamp lamp1 = new MagicLamp(2, 3);
        MagicLamp lamp2 = new MagicLamp(5, 3);
        MagicLamp lamp3 = new MagicLamp(0, 3);

        Genie genieFromLamp1 = lamp1.rub(new Genie(3));
        Genie genieFromLamp2 = lamp1.rub(new Genie(3));
        Genie genieFromLamp3 = lamp1.rub(new Genie(3));

        genieFromLamp1.grantWish(new Wish("Fame", WishType.FAME));
        genieFromLamp1.grantWish(new Wish("Luck", WishType.LUCK));
        genieFromLamp1.grantWish(new Wish("Wealth", WishType.WEALTH));
        genieFromLamp1.grantWish(new Wish("Poor", WishType.POOR));
        genieFromLamp1.grantWish(new Wish("Fame", WishType.FAME));

        genieFromLamp2.grantWish(new Wish("Poor", WishType.POOR));
        genieFromLamp2.grantWish(new Wish("Sickness", WishType.SICKNESS));
        genieFromLamp2.grantWish(new Wish("Luck", WishType.LUCK));
        genieFromLamp2.grantWish(new Wish("Wealth", WishType.WEALTH));
        genieFromLamp2.grantWish(new Wish("Bad Luck", WishType.BAD_LUCK));
        genieFromLamp2.grantWish(new Wish("Fame", WishType.FAME));

        genieFromLamp3.grantWish(new Wish("Poor", WishType.POOR));
        genieFromLamp3.grantWish(new Wish("Sickness", WishType.SICKNESS));
        genieFromLamp3.grantWish(new Wish("Bad Luck", WishType.BAD_LUCK));
        genieFromLamp3.grantWish(new Wish("Fame", WishType.FAME));
        genieFromLamp3.grantWish(new Wish("Poor", WishType.POOR));
    }
}
