package com.schedule.di;

import com.schedule.data.remote.services.implementation.IGroupService;
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
public final class AppModule_ProvideGroupServiceFactory implements Factory<IGroupService> {
  @Override
  public IGroupService get() {
    return provideGroupService();
  }

  public static AppModule_ProvideGroupServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static IGroupService provideGroupService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideGroupService());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideGroupServiceFactory INSTANCE = new AppModule_ProvideGroupServiceFactory();
  }
}
