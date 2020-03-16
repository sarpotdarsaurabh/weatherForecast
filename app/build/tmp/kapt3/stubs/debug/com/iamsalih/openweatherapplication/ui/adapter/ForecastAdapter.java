package com.iamsalih.openweatherapplication.ui.adapter;

import java.lang.System;

/**
 * * Created by muhammedsalihguler on 28.07.17.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/iamsalih/openweatherapplication/ui/adapter/ForecastAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/iamsalih/openweatherapplication/ui/adapter/ForecastAdapter$ForecastViewHolder;", "()V", "forecastList", "", "Lcom/iamsalih/openweatherapplication/ui/ForecastItemViewModel;", "getForecastList", "()Ljava/util/List;", "setForecastList", "(Ljava/util/List;)V", "addForecast", "", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ForecastViewHolder", "app_debug"})
public final class ForecastAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.iamsalih.openweatherapplication.ui.adapter.ForecastAdapter.ForecastViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.iamsalih.openweatherapplication.ui.ForecastItemViewModel> forecastList;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iamsalih.openweatherapplication.ui.ForecastItemViewModel> getForecastList() {
        return null;
    }
    
    public final void setForecastList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iamsalih.openweatherapplication.ui.ForecastItemViewModel> p0) {
    }
    
    public final void addForecast(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iamsalih.openweatherapplication.ui.ForecastItemViewModel> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.iamsalih.openweatherapplication.ui.adapter.ForecastAdapter.ForecastViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.iamsalih.openweatherapplication.ui.adapter.ForecastAdapter.ForecastViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ForecastAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006\u0010"}, d2 = {"Lcom/iamsalih/openweatherapplication/ui/adapter/ForecastAdapter$ForecastViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "forecastElement", "Lcom/iamsalih/openweatherapplication/ui/ForecastItemViewModel;", "getDate", "", "date", "", "openDetailsView", "context", "Landroid/content/Context;", "app_debug"})
    public static final class ForecastViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.iamsalih.openweatherapplication.ui.ForecastItemViewModel forecastElement) {
        }
        
        private final void openDetailsView(android.content.Context context, com.iamsalih.openweatherapplication.ui.ForecastItemViewModel forecastElement) {
        }
        
        private final java.lang.String getDate(long date) {
            return null;
        }
        
        public ForecastViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}