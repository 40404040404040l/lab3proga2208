package org.example;

public abstract class APlanet implements IGetters {
    private final String name;
    private final int size;

    protected APlanet(String name, int size) {
        this.name = name;
        this.size = size;
    }




   public void lookLike() {
       if (Integer.parseInt(getFeature()) < 50 ) {
            System.out.println(getName() + " looks like " + EForm.SMALLPLATE + ".");
   }
        else {
            System.out.println(getName() + " looks like " + EForm.LARGEROUNDTRAY + ".");
        }
   }

    public void conditionOfBrightness() {}












    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFeature() {
        return toString();
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }

}
