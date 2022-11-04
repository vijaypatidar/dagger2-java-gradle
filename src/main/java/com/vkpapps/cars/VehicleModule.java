package com.vkpapps.cars;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class VehicleModule {
    @Binds
    public abstract Engine bindEngine(ElectricEngine engine);
}
