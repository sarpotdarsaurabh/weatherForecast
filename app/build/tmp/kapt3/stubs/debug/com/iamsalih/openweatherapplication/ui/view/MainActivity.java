package com.iamsalih.openweatherapplication.ui.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0016\u0010\u001a\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u001c\u0010\u001e\u001a\u0004\u0018\u0001H\u001f\"\u0006\b\u0000\u0010\u001f\u0018\u0001*\u00020 H\u0086\b\u00a2\u0006\u0002\u0010!J\u001c\u0010\"\u001a\u00020\t*\u00020#2\u0006\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020&R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\'"}, d2 = {"Lcom/iamsalih/openweatherapplication/ui/view/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/iamsalih/openweatherapplication/ui/view/MainView;", "()V", "presenter", "Lcom/iamsalih/openweatherapplication/ui/presenter/MainPresenter;", "getPresenter", "()Lcom/iamsalih/openweatherapplication/ui/presenter/MainPresenter;", "getForecast", "", "query", "", "hideSpinner", "initializeForecastList", "injectDI", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "showErrorToast", "errorType", "Lcom/iamsalih/openweatherapplication/ErrorTypes;", "showSpinner", "updateForecast", "forecasts", "", "Lcom/iamsalih/openweatherapplication/ui/ForecastItemViewModel;", "safeCast", "T", "", "(Ljava/lang/Object;)Ljava/lang/Object;", "toast", "Landroid/app/Activity;", "toastMessage", "duration", "", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity implements com.iamsalih.openweatherapplication.ui.view.MainView {
    @org.jetbrains.annotations.NotNull()
    private final com.iamsalih.openweatherapplication.ui.presenter.MainPresenter presenter = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.iamsalih.openweatherapplication.ui.presenter.MainPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeForecastList() {
    }
    
    private final void injectDI() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void hideSpinner() {
    }
    
    @java.lang.Override()
    public void updateForecast(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iamsalih.openweatherapplication.ui.ForecastItemViewModel> forecasts) {
    }
    
    private final void getForecast(java.lang.String query) {
    }
    
    private final <T extends java.lang.Object>T safeCast(@org.jetbrains.annotations.NotNull()
    java.lang.Object $receiver) {
        return null;
    }
    
    public final void toast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String toastMessage, int duration) {
    }
    
    @java.lang.Override()
    public void showSpinner() {
    }
    
    @java.lang.Override()
    public void showErrorToast(@org.jetbrains.annotations.NotNull()
    com.iamsalih.openweatherapplication.ErrorTypes errorType) {
    }
    
    public MainActivity() {
        super();
    }
}