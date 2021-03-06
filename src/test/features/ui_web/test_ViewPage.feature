# language: ru
# Предусловие для 1 сценария.
#Пользователь НЕ залогинен в системе
#Открыта стартовая страница сервиса Электронные заказные письма (лендинг)

# Предусловие для 2,3,4,5,6,7 сценария.
# Пользователь НЕ залогинен в системе
# Открыта страница подписки на новости /launch-notification
#Доработать
   @SmokeTest @RegressionTest @uiWeb
    Функционал: Cтраница подписки на новости /launch-notification.

    Сценарий: 1. Вид страницы.
        Когда открыта страница Электронные заказные письма (лендинг).
        И выполнено нажатие кн. "Подробнее по подключенным регионам".
        Тогда происходит переход на страницу /limits-alert.
        И затем нажать на ссылку "Узнать о запуске услуги в другом регионе"
        Тогда осуществляется переход на страницу подписки на новости /launch-notification.

    Сценарий: 2. Отправка заявки.
        Когда открытa страница подписки на новости /launch-notification.
        И в поле "Введите регион" указать "Саратовская область".
        И в поле "Введите электронную почту" указать адрeс test@mail.ru.
        Тогда нажать кн. "Отправить заявку".
        И откроется страница с текстом "Заявка отправлена..."
        И затем выполнили шаг назад.
        Тогда осуществился возврат на страницу /limits-alert.

    Сценарий: 3. Ввод некорректного региона.
        Когда открыта страница подписки нa новости /launch-notification
         И в поле "Введите регион" указать "ываыаыа".
         И в поле "Введите электронную почту" уkазать адрес test@mail.ru.
         Тогда нажать кн. "Отправить заявку".
         И поле "Введите регион" подсветилось красным
         И вывелось сообщение "Неправильно введен регион".

    Сценарий: 4. Ввод email некорректного формата.
        Когдa открыта страница подписки на новости /launch-notification.
        И в пoле "Введите регион" yказать "Саратовская область".
        И в пoле "Введите электронную почту" указать адрес  test@ываываыа.
        Тогда нажать кн. "Отправить заявку".
        И поле "Введите электронную почту" подсветилось красным
        И вывелось сообщение "Неправильно введен email".

    Сценарий: 5. Пустые поля.
        Когда открыта страница подписки на новости /launch-notification.
        Тогда нажать кн. "Отправить заявку".
        Тогда поля "Введите регион" и "Введите электронный адрес" подсветились красным цветом.

    Сценарий: 6. Исправить email.
        Когда открыта страница подписки на нoвости /launch-notification.
        И в поле "Введите регион" указать "Саратовская область".
        И в поле "Введите электронную почту" указать адрес  test@main.
        И под полем с электронным адресом появилось сообщение "Возможно, вы имели в виду test@mail.ru?" и ссылка "Исправить"
        И нажать на ссылку "Исправить"
        Тогда нажать кн. "Отправить заявку".
        И произошел переход на страницу подтверждения успешной отправки заявки. В тексте подтверждения фигурирует исправленный емеил (test@mail.ru).

    Сценарий: 7. Не исправлять email.
        Когда открыта страница подписки на новости /launch-notification.
        И в поле "Введите регион" указать "Саратовская область".
        И в поле "Введите электронную почту" указать адрес  test@main.
        И пoд полем с электронным адресом появилось сообщение "Возможно, вы имели в виду test@mail.ru?" и ссылка "Исправить".
        Тогда нажать кн. "Отправить заявку".
        И произошел переход на страницу подтверждения успешной отправки заявки. В тексте подтверждения фигурирует изначально введенный емеил (test@main.ru).

















