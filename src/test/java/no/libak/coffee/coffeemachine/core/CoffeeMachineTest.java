package no.libak.coffee.coffeemachine.core;

import no.libak.coffee.coffeemachine.domain.Coffee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoffeeMachineTest {
    @Test
    public void shouldReturnOk() {
        CoffeeMachine coffeeMachine = new CoffeeMachine(10, 10);

        Coffee coffee = coffeeMachine.brewCoffee("Black", 3);
        assertEquals(3, coffee.getSize());
        assertEquals("Black", coffee.getCoffeeType());
    }

    @Test
    public void shouldNotBrew() {
        CoffeeMachine coffeeMachine = new CoffeeMachine(0,0);
        Coffee coffee = coffeeMachine.brewCoffee("Black", 3);
        assertEquals(null, coffee);
    }

    @Test
    public void shouldBeSmallerThanRequested() {
        CoffeeMachine coffeeMachine = new CoffeeMachine(2, 2);
        Coffee coffee = coffeeMachine.brewCoffee("Black", 3);

        assertEquals(2, coffee.getSize());
    }

    @Test
    public void shouldBeEmptyAfterBrew() {
        CoffeeMachine coffeeMachine = new CoffeeMachine(4, 2);
        Coffee c1 = coffeeMachine.brewCoffee("Latte", 1);
        Coffee c2 = coffeeMachine.brewCoffee("Cappucino", 1);
        Coffee c3 = coffeeMachine.brewCoffee("Black", 1);
        Coffee c4 = coffeeMachine.brewCoffee("Espresso", 1);

        assertEquals(0, coffeeMachine.getMilk());
        assertEquals(0, coffeeMachine.getWater());
    }
}
