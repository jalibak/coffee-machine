package no.libak.coffee.coffeemachine.core;

import no.libak.coffee.coffeemachine.domain.Coffee;
import org.springframework.stereotype.Component;

@Component
public class CoffeeMachine {

    private int water;
    private int milk;

    public CoffeeMachine(int water, int milk) {
        this.water = water;
        this.milk = milk;
    }

    public Coffee brewCoffee(String choice, int size) {
        Coffee coffee = null;


        if("Cappucino".equals(choice) || "Latte".equals(choice)) {
            if(water == 0 || milk == 0) {
                return null;
            }

            int calculatedSize = water-size < 0 ? water : size;

            milk = milk-size < 0 ? 0: milk-size;
            water = water-size < 0 ? 0: water-size;

            coffee = new Coffee(choice, calculatedSize);
        } else if("Espresso".equals(choice) || "Black".equals(choice)) {
            if(water == 0) {
                return null;
            }

            int calculatedSize = water-size < 0 ? water : size;

            water = water-size < 0 ? 0: water-size;

            coffee = new Coffee(choice, calculatedSize);
        }

        return coffee;
    }

    public int getMilk() {
        return milk;
    }

    public int getWater() {
        return water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setWater(int water) {
        this.water = water;
    }
}
