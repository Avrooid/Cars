package ru.Burakov.Cars.Vehicles;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.Burakov.Cars.Engines.Engine;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4j
public class ElectricCar {
    private Engine engine;

    @Autowired
    public ElectricCar(@Qualifier("electricEngine") Engine engine) {
        this.engine = engine;
    }

    @PostConstruct
    public void postConstruct(){
        log.info("Electric car bean created.");
    }

    @PreDestroy
    public void preDestroy(){
        log.info("Electric car bean deleted.");
    }
}
