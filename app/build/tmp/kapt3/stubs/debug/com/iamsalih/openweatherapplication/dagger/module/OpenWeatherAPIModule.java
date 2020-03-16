package com.iamsalih.openweatherapplication.dagger.module;

import java.lang.System;

/**
 * * Created by muhammedsalihguler on 27.07.17.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/iamsalih/openweatherapplication/dagger/module/OpenWeatherAPIModule;", "", "()V", "provideApi", "Lcom/iamsalih/openweatherapplication/api/OpenWeatherAPI;", "gson", "Lcom/google/gson/Gson;", "app_debug"})
@dagger.Module(includes = {com.iamsalih.openweatherapplication.dagger.module.GSONModule.class})
public final class OpenWeatherAPIModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.iamsalih.openweatherapplication.api.OpenWeatherAPI provideApi(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    public OpenWeatherAPIModule() {
        super();
    }
}