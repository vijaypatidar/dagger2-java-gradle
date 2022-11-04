package com.vkpapps.app.analytics;

import com.vkpapps.ApplicationScope;
import javax.inject.Inject;

@ApplicationScope
public class SQLAnalyticsService implements AnalyticsService{
    @Inject
    public SQLAnalyticsService(){

    }

    @Override
    public void log(String event) {

    }
}
