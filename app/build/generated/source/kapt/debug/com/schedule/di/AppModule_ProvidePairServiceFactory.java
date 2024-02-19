package com.schedule.di;

import com.schedule.data.remote.services.implementation.IPairService;
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
public final class AppModule_ProvidePairServiceFactory implements Factory<IPairService> {
  @Override
  public IPairService get() {
    return providePairService();
  }

  public static AppModule_ProvidePairServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static IPairService providePairService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providePairService());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidePairServiceFactory INSTANCE = new AppModule_ProvidePairServiceFactory();
  }
}
