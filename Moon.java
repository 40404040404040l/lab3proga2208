package org.example;

public class Moon extends APlanet {

    protected Moon(String name, int size) {
        super(name, size);
    }

    @Override
    public void conditionOfBrightness() {
        if (Integer.parseInt(getFeature()) > 50 ) {
            System.out.println(getName() + " shines " + Math.round((100/(Integer.parseInt(getFeature())*0.01))/4) + " times brighter than Earth.");
        }
        else {
            System.out.println(getName() + " shines " + Math.round((100/(Integer.parseInt(getFeature())*0.01))/4) + " times less bright than Earth.");
        }
    }
}
