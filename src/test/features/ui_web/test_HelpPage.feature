#language: ru
  # Предусловие для 2-го сценария: Пользователь авторизован и находится в разделе Помощь.

 @SmokeTest @RegressionTest @uiWeb

  Функционал: Раздел "Помощь".

      Сценарий: 1. Раздел помощь.
        Когда открыта страница /help.
        Тогда выполнить переход по всем ссылкам ЧЗВ.

      Сценарий: 2. Клик по логотипу.
        Когда открыта стрaница /help
        Тогда выполнить клик по логотипу.
        И произошел переход в раздел входящие.

      Сценарий: 3 Онлайн чат.
        Когда открыта cтраница /help.
        Тогда на странице Помощь /help сверху страницу нажать ссылку "онлайн-чат".
        И онлайн чат открылся.