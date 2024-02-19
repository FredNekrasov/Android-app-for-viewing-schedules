package com.schedule.domain.use_cases.implementation.room;

import com.schedule.data.remote.services.implementation.room.IAudienceService;
import com.schedule.domain.model.room.Audience;
import com.schedule.domain.repository.IRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class AudienceUseCase_Factory implements Factory<AudienceUseCase> {
  private final Provider<IAudienceService> apiProvider;

  private final Provider<IRepository<Audience>> repositoryProvider;

  public AudienceUseCase_Factory(Provider<IAudienceService> apiProvider,
      Provider<IRepository<Audience>> repositoryProvider) {
    this.apiProvider = apiProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AudienceUseCase get() {
    return newInstance(apiProvider.get(), repositoryProvider.get());
  }

  public static AudienceUseCase_Factory create(Provider<IAudienceService> apiProvider,
      Provider<IRepository<Audience>> repositoryProvider) {
    return new AudienceUseCase_Factory(apiProvider, repositoryProvider);
  }

  public static AudienceUseCase newInstance(IAudienceService api,
      IRepository<Audience> repository) {
    return new AudienceUseCase(api, repository);
  }
}
