# Coffee machine

A Spring Boot application that exposes a rest api for brewing coffee.

## Running the application
Start the application by running mvn spring-boot:run, or package the application with mvn clean package and then run
java -jar target/coffee-machine-0.0.1-SNAPSHOT.jar.

Then visit http://localhost:8080/ and the rest function. E.g. http://localhost:8080/brewCoffee.

## Running the tests
Run the command mvn test.

## Api

/isWorking: check if the coffee machine is working.
/status: check milk and water levels.
/getChoices: get the available coffee choices.
/brewCoffee: Returns a hot cup of coffee, takes two parameters, choice and size, returns an error if not able to brew cup.
/refillWater: fill water.
/refillMilk: fill milk.
