package com.vkpapps.cars;


import javax.inject.Inject;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("ElectricEngine started");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stoped");
    }
}
