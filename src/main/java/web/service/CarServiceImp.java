package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarServiceImp implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Lada1", "1", "Blue1"),
            new Car("Lada2", "2", "Blue2"),
            new Car("Lada3", "3", "Blue3"),
            new Car("Lada4", "4", "Blue4"),
            new Car("Lada5", "5", "Blue5")
    );


    @Override
    public List<Car> getCars(Integer count) {
        List<Car> returnedCars = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            returnedCars.add(cars.get(i));
        }

        return returnedCars;
    }
}
