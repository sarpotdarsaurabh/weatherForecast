package com.iamsalih.openweatherapplication.ui.view;

import java.lang.System;

/**
 * * Created by muhammedsalihguler on 11.08.17.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/iamsalih/openweatherapplication/ui/view/DetailView;", "", "showInformation", "", "forecast", "Lcom/iamsalih/openweatherapplication/ui/ForecastItemViewModel;", "app_debug"})
public abstract interface DetailView {
    
    public abstract void showInformation(@org.jetbrains.annotations.NotNull()
    com.iamsalih.openweatherapplication.ui.ForecastItemViewModel forecast);
}