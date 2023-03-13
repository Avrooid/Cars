package ru.Burakov.Cars.Engines;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {

    @Override
    public void getInfo() {
        System.out.println("This is electric engine.");
    }
}
