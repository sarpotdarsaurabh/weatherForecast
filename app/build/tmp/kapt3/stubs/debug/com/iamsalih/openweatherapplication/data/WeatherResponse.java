package com.iamsalih.openweatherapplication.data;

import java.lang.System;

/**
 * * Created by muhammedsalihguler on 27.07.17.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/iamsalih/openweatherapplication/data/WeatherResponse;", "", "city", "Lcom/iamsalih/openweatherapplication/data/City;", "forecast", "", "Lcom/iamsalih/openweatherapplication/data/ForecastDetail;", "(Lcom/iamsalih/openweatherapplication/data/City;Ljava/util/List;)V", "getCity", "()Lcom/iamsalih/openweatherapplication/data/City;", "setCity", "(Lcom/iamsalih/openweatherapplication/data/City;)V", "getForecast", "()Ljava/util/List;", "setForecast", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class WeatherResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "city")
    private com.iamsalih.openweatherapplication.data.City city;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "list")
    private java.util.List<com.iamsalih.openweatherapplication.data.ForecastDetail> forecast;
    
    @org.jetbrains.annotations.NotNull()
    public final com.iamsalih.openweatherapplication.data.City getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    com.iamsalih.openweatherapplication.data.City p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iamsalih.openweatherapplication.data.ForecastDetail> getForecast() {
        return null;
    }
    
    public final void setForecast(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iamsalih.openweatherapplication.data.ForecastDetail> p0) {
    }
    
    public WeatherResponse(@org.jetbrains.annotations.NotNull()
    com.iamsalih.openweatherapplication.data.City city, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iamsalih.openweatherapplication.data.ForecastDetail> forecast) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iamsalih.openweatherapplication.data.City component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iamsalih.openweatherapplication.data.ForecastDetail> component2() {
        return null;
    }
    
    /**
     * * Created by muhammedsalihguler on 27.07.17.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.iamsalih.openweatherapplication.data.WeatherResponse copy(@org.jetbrains.annotations.NotNull()
    com.iamsalih.openweatherapplication.data.City city, @org.jetbrains.annotations.NotNull()
    java.util.List<com.iamsalih.openweatherapplication.data.ForecastDetail> forecast) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}