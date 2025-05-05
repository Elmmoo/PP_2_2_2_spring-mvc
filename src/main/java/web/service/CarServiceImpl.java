package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    List<Car> carList = Arrays.asList(
            new Car("Toyota", "Camry", 2020),
            new Car("BMW", "X5", 2019),
            new Car("Tesla", "Model S", 2021),
            new Car("Ford", "Mustang", 2017),
            new Car("Honda", "Civic", 2022)
    );

    @Override
    public List<Car> getCars(int count) {
        return count >= carList.size()
                ? carList
                : carList.subList(0, count);
    }
}
