package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> cars = Arrays.asList(
            new Car("BMW", "Black", 2020),
            new Car("Audi", "White", 2019),
            new Car("Mercedes-benz", "Green", 2022),
            new Car("Honda", "Yellow", 2012),
            new Car("Toyota", "Silver", 2015)
    );

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5 || count <= 0) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
