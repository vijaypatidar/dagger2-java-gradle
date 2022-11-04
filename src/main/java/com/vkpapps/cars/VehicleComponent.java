package com.vkpapps.cars;

import dagger.Subcomponent;
import javax.inject.Singleton;

@Subcomponent(modules = {VehicleModule.class})
@Singleton
public interface VehicleComponent {
    Car buildCar();

    @Subcomponent.Factory
    interface Factory{
        VehicleComponent create();
    }
}
