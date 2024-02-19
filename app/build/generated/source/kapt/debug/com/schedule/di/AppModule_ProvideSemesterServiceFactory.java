package com.schedule.di;

import com.schedule.data.remote.services.implementation.date.ISemesterService;
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
public final class AppModule_ProvideSemesterServiceFactory implements Factory<ISemesterService> {
  @Override
  public ISemesterService get() {
    return provideSemesterService();
  }

  public static AppModule_ProvideSemesterServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ISemesterService provideSemesterService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSemesterService());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideSemesterServiceFactory INSTANCE = new AppModule_ProvideSemesterServiceFactory();
  }
}
