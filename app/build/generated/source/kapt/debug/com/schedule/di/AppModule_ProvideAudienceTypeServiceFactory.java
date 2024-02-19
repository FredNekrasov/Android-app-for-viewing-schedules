package com.schedule.di;

import com.schedule.data.remote.services.implementation.room.IAudienceTypeService;
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
public final class AppModule_ProvideAudienceTypeServiceFactory implements Factory<IAudienceTypeService> {
  @Override
  public IAudienceTypeService get() {
    return provideAudienceTypeService();
  }

  public static AppModule_ProvideAudienceTypeServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static IAudienceTypeService provideAudienceTypeService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAudienceTypeService());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideAudienceTypeServiceFactory INSTANCE = new AppModule_ProvideAudienceTypeServiceFactory();
  }
}
