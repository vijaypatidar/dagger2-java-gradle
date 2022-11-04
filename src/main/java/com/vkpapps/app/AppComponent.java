package com.vkpapps.app;

import com.vkpapps.ApplicationScope;
import com.vkpapps.app.analytics.AnalyticsModule;
import com.vkpapps.cars.VehicleComponent;
import dagger.Component;

@Component(modules = {AppModule.class})
@ApplicationScope
public interface AppComponent {
    VehicleComponent.Factory getFactory();

    @Component.Factory
    interface Factory {
        AppComponent create();
    }
}
