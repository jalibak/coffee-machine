# Coffee machine

A Spring Boot application that exposes a rest api for brewing coffee.

## Running the application
Start the application by running mvn spring-boot:run.

## Running the tests
Run the command mvn test.

## Api

/isWorking: check if the coffee machine is working.
/status: check milk and water levels.
/getChoices: get the available coffee choices.
/brewCoffee: brew a cup of coffee, takes two parameters, choice and size, returns an error if not able to brew cup.
/refillWater: fill water.
/refillMilk: fill milk.
