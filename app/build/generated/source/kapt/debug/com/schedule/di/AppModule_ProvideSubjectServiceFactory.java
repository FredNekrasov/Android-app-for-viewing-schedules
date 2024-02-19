package com.schedule.di;

import com.schedule.data.remote.services.implementation.ISubjectService;
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
public final class AppModule_ProvideSubjectServiceFactory implements Factory<ISubjectService> {
  @Override
  public ISubjectService get() {
    return provideSubjectService();
  }

  public static AppModule_ProvideSubjectServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ISubjectService provideSubjectService() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSubjectService());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideSubjectServiceFactory INSTANCE = new AppModule_ProvideSubjectServiceFactory();
  }
}
