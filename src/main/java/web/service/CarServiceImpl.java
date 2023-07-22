package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Hyundai", "������", 2021));
        cars.add(new Car("Mercedes", "�����", 2020));
        cars.add(new Car("LADA", "�����", 2022));
        cars.add(new Car("Tesla", "�������", 2010));
        cars.add(new Car("BELAZ", "����� ��� ����?", 2023));
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