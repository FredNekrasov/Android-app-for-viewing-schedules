package com.schedule.di;

import com.schedule.data.remote.services.implementation.ITeacherService;
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
public final class AppModule_ProvideTeacherServiceFactory implements Factory<ITeacherService> {
  @Override
  public ITeacherService get() {
    return provideTeacherService();
  }

  public static AppModule_ProvideTeacherServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ITeacherService provideTeacherService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideTeacherService());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideTeacherServiceFactory INSTANCE = new AppModule_ProvideTeacherServiceFactory();
  }
}
