package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private final List<Car> cars;

    public CarDaoImp() {
        this.cars = Arrays.asList(new Car("BMW", "Black", 2020),
                new Car("Audi", "White", 2019),
                new Car("Mercedes-benz", "Green", 2022),
                new Car("Honda", "Yellow", 2012),
                new Car("Toyota", "Silver", 2015)
        );
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0,count);
    }
}
