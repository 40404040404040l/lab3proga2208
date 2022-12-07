package org.example;

public abstract class APerson implements IMove, IGetters, ICheckTruth {
    public String name;
    public String status;

    public APerson(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFeature() {
        return status;
    }

    @Override
    public void changeLocation() {
        if (getFeature().equals("Others")) {
            System.out.println(getName() + " will stay in " + ELocation.CAGE + ".");
        }
        else {
            System.out.println(getName() + " will go to " + ELocation.RETURNWAY + ".");
        }
    }

    @Override
    public void talk() {
        System.out.println("сказал");
    }

    @Override
    public void seeAbout() {}

    @Override
    public void checkTruth(APlanet planet1, APlanet planet2) {
        if (Integer.parseInt(planet1.getFeature()) > Integer.parseInt(planet2.getFeature())){
            System.out.println("All facts are true.");
            System.out.println("The possibility to " + EAbilities.READ + ", " + EAbilities.WRITE + ", " + EAbilities.DRAW + ", " + EAbilities.DOANYTHINGELSE + ".");
        }
        else {
            System.out.println("All facts are lies.");
        }
    }


}
