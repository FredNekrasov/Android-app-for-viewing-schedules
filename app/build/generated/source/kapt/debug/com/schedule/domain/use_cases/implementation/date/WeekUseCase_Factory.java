package com.schedule.domain.use_cases.implementation.date;

import com.schedule.data.remote.services.implementation.date.IWeekService;
import com.schedule.domain.model.date.Week;
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
public final class WeekUseCase_Factory implements Factory<WeekUseCase> {
  private final Provider<IWeekService> apiProvider;

  private final Provider<IRepository<Week>> repositoryProvider;

  public WeekUseCase_Factory(Provider<IWeekService> apiProvider,
      Provider<IRepository<Week>> repositoryProvider) {
    this.apiProvider = apiProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public WeekUseCase get() {
    return newInstance(apiProvider.get(), repositoryProvider.get());
  }

  public static WeekUseCase_Factory create(Provider<IWeekService> apiProvider,
      Provider<IRepository<Week>> repositoryProvider) {
    return new WeekUseCase_Factory(apiProvider, repositoryProvider);
  }

  public static WeekUseCase newInstance(IWeekService api, IRepository<Week> repository) {
    return new WeekUseCase(api, repository);
  }
}
