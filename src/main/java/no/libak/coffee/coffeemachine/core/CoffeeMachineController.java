package no.libak.coffee.coffeemachine.core;

import no.libak.coffee.coffeemachine.domain.Coffee;
import no.libak.coffee.coffeemachine.exception.CoffeeMachineException;
import no.libak.coffee.coffeemachine.service.CoffeeMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeMachineController implements CoffeeMachineService{

    @Autowired
    private CoffeeMachine coffeeMachine;

    @RequestMapping("/brewCoffee")
    public Coffee brewCoffee(@RequestParam(value = "choice", defaultValue = "Black") String choice,
                            @RequestParam(value = "size", defaultValue = "2") int size) throws CoffeeMachineException {
        Coffee coffee = coffeeMachine.brewCoffee(choice, size);

        if(coffee == null)
            throw new CoffeeMachineException("Could not brew coffee");

        return coffee;
    }

    @RequestMapping("/getChoices")
    public String[] getChoices() {
       return new String[] {"Black", "Cappucino", "Espresso", "Latte"};
    }

    @RequestMapping("/status")
    public CoffeeMachine status() {
        return coffeeMachine;
    }

    @RequestMapping("/isWorking")
    public String isWorking() {
        return "I am working";
    }

    @RequestMapping("/refillWater")
    public void refillWater() {
        coffeeMachine.setWater(10);
    }

    @RequestMapping("/refillMilk")
    public void refillMilk() {
        coffeeMachine.setMilk(10);
    }
}
