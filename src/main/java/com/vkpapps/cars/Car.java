package com.vkpapps.cars;


import com.vkpapps.app.analytics.AnalyticsService;
import javax.inject.Inject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private final Engine engine;
    private final AnalyticsService analyticsService;
    @Inject
    public Car(Engine engine, AnalyticsService analyticsService) {
        this.engine = engine;
        this.analyticsService = analyticsService;
    }
}
