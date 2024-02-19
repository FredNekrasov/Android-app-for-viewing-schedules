package com.schedule.domain.use_cases.user.implementation;

import com.schedule.data.remote.services.implementation.IUserService;
import com.schedule.domain.model.User;
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
public final class UserUseCase_Factory implements Factory<UserUseCase> {
  private final Provider<IUserService> apiProvider;

  private final Provider<IRepository<User>> repositoryProvider;

  public UserUseCase_Factory(Provider<IUserService> apiProvider,
      Provider<IRepository<User>> repositoryProvider) {
    this.apiProvider = apiProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public UserUseCase get() {
    return newInstance(apiProvider.get(), repositoryProvider.get());
  }

  public static UserUseCase_Factory create(Provider<IUserService> apiProvider,
      Provider<IRepository<User>> repositoryProvider) {
    return new UserUseCase_Factory(apiProvider, repositoryProvider);
  }

  public static UserUseCase newInstance(IUserService api, IRepository<User> repository) {
    return new UserUseCase(api, repository);
  }
}
