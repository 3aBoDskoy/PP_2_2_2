package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Hyundai", "Черный", 2021));
        cars.add(new Car("Mercedes", "Синий", 2020));
        cars.add(new Car("LADA", "Белый", 2022));
        cars.add(new Car("Tesla", "Красный", 2010));
        cars.add(new Car("BELAZ", "Зачем ему цвет?", 2023));
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        if(count != null) {
            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }
}