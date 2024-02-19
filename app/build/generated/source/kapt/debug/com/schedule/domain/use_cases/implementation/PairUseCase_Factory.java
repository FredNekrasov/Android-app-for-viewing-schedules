package com.schedule.domain.use_cases.implementation;

import com.schedule.data.remote.services.implementation.IPairService;
import com.schedule.domain.model.PairEntity;
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
public final class PairUseCase_Factory implements Factory<PairUseCase> {
  private final Provider<IPairService> apiProvider;

  private final Provider<IRepository<PairEntity>> repositoryProvider;

  public PairUseCase_Factory(Provider<IPairService> apiProvider,
      Provider<IRepository<PairEntity>> repositoryProvider) {
    this.apiProvider = apiProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PairUseCase get() {
    return newInstance(apiProvider.get(), repositoryProvider.get());
  }

  public static PairUseCase_Factory create(Provider<IPairService> apiProvider,
      Provider<IRepository<PairEntity>> repositoryProvider) {
    return new PairUseCase_Factory(apiProvider, repositoryProvider);
  }

  public static PairUseCase newInstance(IPairService api, IRepository<PairEntity> repository) {
    return new PairUseCase(api, repository);
  }
}
