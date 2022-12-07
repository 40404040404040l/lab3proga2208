package org.example;

public class Znajka extends APerson {

    public Znajka(String name, String status) {
        super(name, status);
    }

    @Override
    public void changeLocation() {
        System.out.println("he will go to " + ELocation.RETURNWAY + ".");
    }

    @Override
    public void seeAbout() {
        System.out.print(name + " see about that ");
    }
}
