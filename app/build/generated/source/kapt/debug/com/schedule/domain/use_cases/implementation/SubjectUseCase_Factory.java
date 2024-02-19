package com.schedule.domain.use_cases.implementation;

import com.schedule.data.remote.services.implementation.ISubjectService;
import com.schedule.domain.model.Subject;
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
public final class SubjectUseCase_Factory implements Factory<SubjectUseCase> {
  private final Provider<ISubjectService> apiProvider;

  private final Provider<IRepository<Subject>> repositoryProvider;

  public SubjectUseCase_Factory(Provider<ISubjectService> apiProvider,
      Provider<IRepository<Subject>> repositoryProvider) {
    this.apiProvider = apiProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SubjectUseCase get() {
    return newInstance(apiProvider.get(), repositoryProvider.get());
  }

  public static SubjectUseCase_Factory create(Provider<ISubjectService> apiProvider,
      Provider<IRepository<Subject>> repositoryProvider) {
    return new SubjectUseCase_Factory(apiProvider, repositoryProvider);
  }

  public static SubjectUseCase newInstance(ISubjectService api, IRepository<Subject> repository) {
    return new SubjectUseCase(api, repository);
  }
}
