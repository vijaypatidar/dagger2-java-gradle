package com.vkpapps.app.analytics;

import dagger.Binds;
import dagger.Module;

@Module
public interface AnalyticsModule {
    @Binds
    AnalyticsService bindAnalyticsService(SQLAnalyticsService sqlAnalyticsService);
}
