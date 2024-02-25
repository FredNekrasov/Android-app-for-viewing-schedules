# Приложение для просмотра расписания учебного заведения

## Описание приложения v1:
Для доступа к данным есть система авторизации, которая позволяет войти в приложение с использованием учетных данных, полученных через веб-сервис. Если данные отсутствуют, то будет следует пройти процесс регистрации, который находится в стадии **разработки**.
Приложение предоставляет пользователю возможность просматривать информацию о расписании, получаемой через [API](https://github.com/FredNekrasov/service_for_storing_schedules/tree/ForMobile), с использованием удобного и интуитивно понятного интерфейса.
Пользовательский интерфейс приложения разработан с фокусом на простоту и удобство использования. Все элементы интерфейса должны быть интуитивно понятными для пользователя.

### Использованные библиотеки:
1. **Retrofit2** - для работы с API и получения данных о расписании.
2. **Converter Moshi** - для сериализации/десериализации данных между JSON и объектами.
3. **Koin** - для управления зависимостями в приложении, что обеспечит хорошую масштабируемость и чистоту кода.
4. **Navigation Compose** - для реализации навигации между различными экранами.

Планы на будущее:
-
- В перспективе планируется развитие функционала приложения, добавляя возможность кэширования, работы с данными пользователей (создание, изменение, удаление) и обработку ошибок. Для локального кэширования данных, скорее всего, будет использован `RealmDB`.
- В настоящее время приложение использует [API](https://github.com/FredNekrasov/service_for_storing_schedules/tree/ForMobile) для получения данных, однако рассматривается миграция на более масштабируемый и эффективный [RESTful API](https://github.com/FredNekrasov/service_for_storing_schedules) для улучшения производительности и расширения функциональности. А также переход на `ktor-client` и `kotlinx.serialization` для выполнения сетевых запросов.

Приложение разработано по принципам `Clean Architecture`, что обеспечивает четкое разделение слоев и ответственностей, делает код более читаемым и поддерживаемым. При разработке приложения также учитывается принцип `KISS`, то есть стремление к простоте и минимализму в процессе разработки, что позволяет избежать излишней сложности, сохранить код чистым, сделать приложение легким для понимания.

В итоге разработанное приложение предоставляет пользователю удобный и эффективный способ просмотра информации о расписании с возможностью авторизации и использования API для получения актуальных данных.
