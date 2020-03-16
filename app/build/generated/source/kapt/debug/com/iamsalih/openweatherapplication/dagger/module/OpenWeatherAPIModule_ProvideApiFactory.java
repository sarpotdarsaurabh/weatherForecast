package com.iamsalih.openweatherapplication.dagger.module;

import com.google.gson.Gson;
import com.iamsalih.openweatherapplication.api.OpenWeatherAPI;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OpenWeatherAPIModule_ProvideApiFactory implements Factory<OpenWeatherAPI> {
  private final OpenWeatherAPIModule module;

  private final Provider<Gson> gsonProvider;

  public OpenWeatherAPIModule_ProvideApiFactory(
      OpenWeatherAPIModule module, Provider<Gson> gsonProvider) {
    assert module != null;
    this.module = module;
    assert gsonProvider != null;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public OpenWeatherAPI get() {
    return Preconditions.checkNotNull(
        module.provideApi(gsonProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OpenWeatherAPI> create(
      OpenWeatherAPIModule module, Provider<Gson> gsonProvider) {
    return new OpenWeatherAPIModule_ProvideApiFactory(module, gsonProvider);
  }
}
