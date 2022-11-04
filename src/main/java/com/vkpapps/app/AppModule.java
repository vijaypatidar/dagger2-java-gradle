package com.vkpapps.app;

import com.vkpapps.app.analytics.AnalyticsModule;
import dagger.Module;

@Module(includes = {AnalyticsModule.class})
public class AppModule {
}
