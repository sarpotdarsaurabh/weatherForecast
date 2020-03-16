package com.iamsalih.openweatherapplication.api;

import java.lang.System;

/**
 * * Created by muhammedsalihguler on 27.07.17.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\n"}, d2 = {"Lcom/iamsalih/openweatherapplication/api/OpenWeatherAPI;", "", "dailyForecast", "Lretrofit2/Call;", "Lcom/iamsalih/openweatherapplication/data/WeatherResponse;", "cityName", "", "dayCount", "", "Companion", "app_debug"})
public abstract interface OpenWeatherAPI {
    public static final com.iamsalih.openweatherapplication.api.OpenWeatherAPI.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "forecast/daily")
    public abstract retrofit2.Call<com.iamsalih.openweatherapplication.data.WeatherResponse> dailyForecast(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String cityName, @retrofit2.http.Query(value = "cnt")
    int dayCount);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/iamsalih/openweatherapplication/api/OpenWeatherAPI$Companion;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String BASE_URL = "http://api.openweathermap.org/data/2.5/";
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBASE_URL() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}