package org.example;

public class Main {
    public static void main(String[] args) {

        APerson znajka = new Znajka("Znajka", "Friend");
        APerson fuksia = new Fuksia("Fuksia", "Friend");
        APerson seledochka = new Seledochka("Seledochka", "Friend");
        APerson zvezdochkin = new Zvezdochkin("Zvezdochkin", "Professor");
        APerson others = new Others("Others", "Others");

        znajka.seeAbout();
        znajka.changeLocation();
        fuksia.changeLocation();
        seledochka.changeLocation();
        zvezdochkin.changeLocation();
        others.changeLocation();

        APlanet earth = new Earth("Earth", 100);
        APlanet moon = new Moon("Moon", 27);


        earth.lookLike();
        moon.lookLike();

        moon.conditionOfBrightness();

        znajka.checkTruth(earth, moon);





    }
}