package com.schedule.domain.use_cases.implementation;

import com.schedule.data.remote.services.implementation.IGroupService;
import com.schedule.domain.model.Squad;
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
public final class SquadUseCase_Factory implements Factory<SquadUseCase> {
  private final Provider<IGroupService> apiProvider;

  private final Provider<IRepository<Squad>> repositoryProvider;

  public SquadUseCase_Factory(Provider<IGroupService> apiProvider,
      Provider<IRepository<Squad>> repositoryProvider) {
    this.apiProvider = apiProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SquadUseCase get() {
    return newInstance(apiProvider.get(), repositoryProvider.get());
  }

  public static SquadUseCase_Factory create(Provider<IGroupService> apiProvider,
      Provider<IRepository<Squad>> repositoryProvider) {
    return new SquadUseCase_Factory(apiProvider, repositoryProvider);
  }

  public static SquadUseCase newInstance(IGroupService api, IRepository<Squad> repository) {
    return new SquadUseCase(api, repository);
  }
}
