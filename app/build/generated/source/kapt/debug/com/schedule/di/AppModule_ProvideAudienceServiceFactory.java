package com.schedule.di;

import com.schedule.data.remote.services.implementation.room.IAudienceService;
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
public final class AppModule_ProvideAudienceServiceFactory implements Factory<IAudienceService> {
  @Override
  public IAudienceService get() {
    return provideAudienceService();
  }

  public static AppModule_ProvideAudienceServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static IAudienceService provideAudienceService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAudienceService());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideAudienceServiceFactory INSTANCE = new AppModule_ProvideAudienceServiceFactory();
  }
}
