package com.schedule.di;

import com.schedule.data.remote.services.implementation.IUserService;
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
public final class AppModule_ProvideUserServiceFactory implements Factory<IUserService> {
  @Override
  public IUserService get() {
    return provideUserService();
  }

  public static AppModule_ProvideUserServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static IUserService provideUserService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideUserService());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideUserServiceFactory INSTANCE = new AppModule_ProvideUserServiceFactory();
  }
}
