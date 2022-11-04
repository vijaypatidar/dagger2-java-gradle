package com.vkpapps.cars;


import com.vkpapps.app.analytics.AnalyticsService;
import javax.inject.Inject;

public class ElectricEngine implements Engine{
    @Inject
    public ElectricEngine(){

    }
    @Override
    public void start() {
        System.out.println("ElectricEngine started");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stoped");
    }
}
