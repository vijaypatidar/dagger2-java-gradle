package com.vkpapps.cars;


import com.vkpapps.app.analytics.AnalyticsService;
import javax.inject.Inject;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class Car {
    private final Engine engine;
    private final AnalyticsService analyticsService;
}
