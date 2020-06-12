/**
 * Based on: https://refactoring.guru/design-patterns/builder/java/example
 */

package builder.example;

import builder.example.builders.CarBuilder;
import builder.example.builders.CarManualBuilder;
import builder.example.cars.Car;
import builder.example.cars.Manual;
import builder.example.director.Director;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
        
        // Creating additional things
        System.out.println("Creating other things\n");
        director.constructCityCar(builder);
        director.constructCityCar(manualBuilder);
        car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());
        carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
