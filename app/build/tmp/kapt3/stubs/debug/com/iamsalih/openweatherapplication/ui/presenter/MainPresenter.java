package com.iamsalih.openweatherapplication.ui.presenter;

import java.lang.System;

/**
 * * Created by muhammedsalihguler on 28.07.17.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/iamsalih/openweatherapplication/ui/presenter/MainPresenter;", "", "view", "Lcom/iamsalih/openweatherapplication/ui/view/MainView;", "(Lcom/iamsalih/openweatherapplication/ui/view/MainView;)V", "api", "Lcom/iamsalih/openweatherapplication/api/OpenWeatherAPI;", "getApi", "()Lcom/iamsalih/openweatherapplication/api/OpenWeatherAPI;", "setApi", "(Lcom/iamsalih/openweatherapplication/api/OpenWeatherAPI;)V", "getView", "()Lcom/iamsalih/openweatherapplication/ui/view/MainView;", "createListForView", "", "weatherResponse", "Lcom/iamsalih/openweatherapplication/data/WeatherResponse;", "cityName", "", "getForecastForSevenDays", "app_debug"})
public final class MainPresenter {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.iamsalih.openweatherapplication.api.OpenWeatherAPI api;
    @org.jetbrains.annotations.NotNull()
    private final com.iamsalih.openweatherapplication.ui.view.MainView view = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.iamsalih.openweatherapplication.api.OpenWeatherAPI getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull()
    com.iamsalih.openweatherapplication.api.OpenWeatherAPI p0) {
    }
    
    public final void getForecastForSevenDays(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
    }
    
    private final void createListForView(com.iamsalih.openweatherapplication.data.WeatherResponse weatherResponse, java.lang.String cityName) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iamsalih.openweatherapplication.ui.view.MainView getView() {
        return null;
    }
    
    public MainPresenter(@org.jetbrains.annotations.NotNull()
    com.iamsalih.openweatherapplication.ui.view.MainView view) {
        super();
    }
}