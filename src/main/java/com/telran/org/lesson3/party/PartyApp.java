package com.telran.org.lesson3.party;

public class PartyApp {

    public static void main(String[] args) {
        Man alex = new Man("Alex", "M", 25); // mojno podmenyat realizatciyu vmesto Man na GrandParent
        Man igor = new Man("Igor", "M", 27);
        Woman alina = new Woman("Alina", "F", 31);
        Woman masha = new Woman("Masha", "F", 23);
        Child child = new Child("Mike", "M", 10);
        GrandParent victor = new GrandParent("Victor", "M", 69);

        Guest[] guests = {alex, igor, alina, masha, child, victor};

        for (Guest guest : guests) {
            guest.printGreetings();
        }

//        ArrayList<DrinkAlcohol> = new ArrayList<>();
        DrinkAlcohol[] drinker = new DrinkAlcohol[10]; // massive interfeisov that implements list of arrays
        LikeDance[] dancer = new LikeDance[10];
        Sleep[] sleeper = new Sleep[10];

        sortGuests(guests, drinker, dancer, sleeper);

        for (DrinkAlcohol element : drinker) {
            if (element != null) {
                element.drink();
            }
        }

        for (LikeDance dance : dancer) {
            if (dance != null) {
                dance.dance();
            }
        }

        for (Sleep sleep : sleeper) {
            if (sleep != null) {
                sleep.sleep();
            }
        }
    }


       private static void sortGuests(Guest[] guests, DrinkAlcohol[] drinker, LikeDance[] dancer, Sleep[] sleeper){
            int daIndex = 0;
            int ldIndex = 0;
            int slIndex = 0;

            for (Guest guest : guests) {
                if(guest instanceof DrinkAlcohol) {
                    drinker[daIndex] =(DrinkAlcohol) guest;
                    daIndex++;
                }

                if(guest instanceof LikeDance) {
                    dancer[ldIndex] =(LikeDance) guest;
                    ldIndex++;
                }
                if(guest instanceof Sleep) {
                    sleeper[slIndex] =(Sleep) guest;
                    slIndex++;
                }
            }
        }
}