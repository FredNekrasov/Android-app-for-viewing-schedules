package com.schedule.di;

import com.schedule.data.remote.services.implementation.date.IWeekService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideWeekServiceFactory implements Factory<IWeekService> {
  @Override
  public IWeekService get() {
    return provideWeekService();
  }

  public static AppModule_ProvideWeekServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static IWeekService provideWeekService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideWeekService());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideWeekServiceFactory INSTANCE = new AppModule_ProvideWeekServiceFactory();
  }
}
