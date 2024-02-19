package com.schedule.domain.use_cases.implementation.date;

import com.schedule.data.remote.services.implementation.date.ISemesterService;
import com.schedule.domain.model.date.Semester;
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
public final class SemesterUseCase_Factory implements Factory<SemesterUseCase> {
  private final Provider<ISemesterService> apiProvider;

  private final Provider<IRepository<Semester>> repositoryProvider;

  public SemesterUseCase_Factory(Provider<ISemesterService> apiProvider,
      Provider<IRepository<Semester>> repositoryProvider) {
    this.apiProvider = apiProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SemesterUseCase get() {
    return newInstance(apiProvider.get(), repositoryProvider.get());
  }

  public static SemesterUseCase_Factory create(Provider<ISemesterService> apiProvider,
      Provider<IRepository<Semester>> repositoryProvider) {
    return new SemesterUseCase_Factory(apiProvider, repositoryProvider);
  }

  public static SemesterUseCase newInstance(ISemesterService api,
      IRepository<Semester> repository) {
    return new SemesterUseCase(api, repository);
  }
}
