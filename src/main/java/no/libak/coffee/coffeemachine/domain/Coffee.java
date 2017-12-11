package no.libak.coffee.coffeemachine.domain;

public class Coffee {
    private String coffeeType;
    private int size;

    public Coffee(String coffeeType, int size) {
        this.coffeeType = coffeeType;
        this.size = size;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
