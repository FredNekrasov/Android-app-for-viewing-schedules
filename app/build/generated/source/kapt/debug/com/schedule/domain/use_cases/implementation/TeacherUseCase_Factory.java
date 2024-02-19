package com.schedule.domain.use_cases.implementation;

import com.schedule.data.remote.services.implementation.ITeacherService;
import com.schedule.domain.model.Teacher;
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
public final class TeacherUseCase_Factory implements Factory<TeacherUseCase> {
  private final Provider<ITeacherService> apiProvider;

  private final Provider<IRepository<Teacher>> repositoryProvider;

  public TeacherUseCase_Factory(Provider<ITeacherService> apiProvider,
      Provider<IRepository<Teacher>> repositoryProvider) {
    this.apiProvider = apiProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public TeacherUseCase get() {
    return newInstance(apiProvider.get(), repositoryProvider.get());
  }

  public static TeacherUseCase_Factory create(Provider<ITeacherService> apiProvider,
      Provider<IRepository<Teacher>> repositoryProvider) {
    return new TeacherUseCase_Factory(apiProvider, repositoryProvider);
  }

  public static TeacherUseCase newInstance(ITeacherService api, IRepository<Teacher> repository) {
    return new TeacherUseCase(api, repository);
  }
}
