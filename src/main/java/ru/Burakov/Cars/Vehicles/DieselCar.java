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
public class DieselCar {
    private Engine engine;

    @PostConstruct
    public void postConstruct(){
        log.info("Diesel car bean created.");
    }

    @PreDestroy
    public void preDestroy(){
        log.info("Diesel car bean deleted.");
    }

    @Autowired
    public void setEngine(@Qualifier("dieselEngine") Engine engine) {
        this.engine = engine;
    }
}
