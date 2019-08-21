package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;

        car = new Car(1925, "Hugo", "HooptiLength");
        repository.save(car);

        car = new Car(1950, "Ford", "FusionLength");
        repository.save(car);

        car = new Car(1975, "Honda", "CivicLength");
        repository.save(car);

    }

}