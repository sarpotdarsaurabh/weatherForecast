package com.iamsalih.openweatherapplication.ui.view;

import java.lang.System;

/**
 * * Created by muhammedsalihguler on 11.08.17.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/iamsalih/openweatherapplication/ui/view/DetailActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/iamsalih/openweatherapplication/ui/view/DetailView;", "()V", "presenter", "Lcom/iamsalih/openweatherapplication/ui/presenter/DetailPresenter;", "getPresenter", "()Lcom/iamsalih/openweatherapplication/ui/presenter/DetailPresenter;", "getDate", "", "date", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showInformation", "forecast", "Lcom/iamsalih/openweatherapplication/ui/ForecastItemViewModel;", "app_debug"})
public final class DetailActivity extends android.support.v7.app.AppCompatActivity implements com.iamsalih.openweatherapplication.ui.view.DetailView {
    @org.jetbrains.annotations.NotNull()
    private final com.iamsalih.openweatherapplication.ui.presenter.DetailPresenter presenter = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.iamsalih.openweatherapplication.ui.presenter.DetailPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void showInformation(@org.jetbrains.annotations.NotNull()
    com.iamsalih.openweatherapplication.ui.ForecastItemViewModel forecast) {
    }
    
    private final java.lang.String getDate(long date) {
        return null;
    }
    
    public DetailActivity() {
        super();
    }
}