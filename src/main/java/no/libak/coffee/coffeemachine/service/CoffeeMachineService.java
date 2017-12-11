package no.libak.coffee.coffeemachine.service;

import no.libak.coffee.coffeemachine.domain.Coffee;
import no.libak.coffee.coffeemachine.exception.CoffeeMachineException;

public interface CoffeeMachineService {
    public Coffee brewCoffee(String type, int size) throws CoffeeMachineException;
    public String isWorking();
    public String[] getChoices();
    public void refillWater();
    public void refillMilk();
}
