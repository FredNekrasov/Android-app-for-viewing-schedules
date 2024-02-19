package com.schedule.domain.use_cases.implementation.room;

import com.schedule.data.remote.services.implementation.room.IAudienceTypeService;
import com.schedule.domain.model.room.AudienceType;
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
public final class AudienceTypeUseCase_Factory implements Factory<AudienceTypeUseCase> {
  private final Provider<IAudienceTypeService> apiProvider;

  private final Provider<IRepository<AudienceType>> repositoryProvider;

  public AudienceTypeUseCase_Factory(Provider<IAudienceTypeService> apiProvider,
      Provider<IRepository<AudienceType>> repositoryProvider) {
    this.apiProvider = apiProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AudienceTypeUseCase get() {
    return newInstance(apiProvider.get(), repositoryProvider.get());
  }

  public static AudienceTypeUseCase_Factory create(Provider<IAudienceTypeService> apiProvider,
      Provider<IRepository<AudienceType>> repositoryProvider) {
    return new AudienceTypeUseCase_Factory(apiProvider, repositoryProvider);
  }

  public static AudienceTypeUseCase newInstance(IAudienceTypeService api,
      IRepository<AudienceType> repository) {
    return new AudienceTypeUseCase(api, repository);
  }
}
