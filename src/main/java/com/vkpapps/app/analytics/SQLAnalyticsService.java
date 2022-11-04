package com.vkpapps.app.analytics;

import com.vkpapps.ApplicationScope;
import javax.inject.Inject;
import lombok.RequiredArgsConstructor;

@ApplicationScope
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class SQLAnalyticsService implements AnalyticsService{

    @Override
    public void log(String event) {

    }
}
