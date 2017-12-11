package no.libak.coffee.coffeemachine;

import no.libak.coffee.coffeemachine.core.CoffeeMachine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoffeeMachineConfiguration {

    @Bean
    public CoffeeMachine coffeeMachine() {
        return new CoffeeMachine(10,10);
    }

}
