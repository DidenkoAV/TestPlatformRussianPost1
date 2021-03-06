# language: ru
# Предусловие для 1,2 сценария.
# Пользователь неактивирован и не залогинен, не является сотрудником организации
# Пользователь открыл страницу лендинга https://erl-individual-web.test.russianpost.ru/
    @SmokeTest @RegressionTest @uiWeb
    Функционал: Cтраница подписки на новости /launch-notification.

    Сценарий: 1. Авторизация с помощью ссылки "Войти через Госуслуги".
        Когда открыта страница Электронные заказные письма (лендинг)
        Тогда в хедере пройти по ссылке "Войти" (/api/v1/oauth?success_url=/setup)
        И авторизоваться под пользователем (пользователь переходит на страницу /register с выбором типа регистрации - Себя или Организацию)
        И выбрать себя
        Тогда подгружаются контакты и адреса из ЕСИА (подтвержденные с зеленой галочкой).

    Сценарий: 2. Авторизация с помощью кнопки "Подробнее по подключенным регионам".
        Когда открыта страница Электронные заказные письма (лендинг).
        Тогда нажать кнопку "Подключить услугу". (переход на страницу /limits-alert)
        И нажать кнопку "Продолжить подключение". (переход на страницу /register)
        Тогда нажать ссылку "Себя" (переход на страницу /register/individual)
        И нажать кнопку "Войти через Портал госуслуг" (переход на страницу авторизации через ЕСИА)
        И авторизоваться пользователем (переход на страницу /setup)

     Сценарий: 3. Выход из ЛК.
        Когда пользователь находится на странице /setup.
        Тогда необходимо нажать на Имя Фамилию пользователя в правом углу хедера страницы.
        И нажать "Выйти" в меню ЛК.