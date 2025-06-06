# NotificationService

Приложение отправляет уведомления, то есть выводит сообщения в соответствующем формате в консоль.  

Каждое уведомление имплементирует интерфейс **Notification**.  

Уведомления отправляются клиентам по разным каналам через свой класс-сервис. Каждый класс для отправки уведомлений имплементирует интерфейс **NotificationSender**.  

В приложении реализованы три вида уведомлений:

**EmailNotification** — письмо на электронную почту.  

**SmsNotification** — СМС-сообщение.  

**PushNotification** — уведомление для приложений мобильных устройств.  

Особенности каждого класса уведомлений:  

**EmailNotification:**  

- Текст для электронной почты обозначен тегами `<p>Текст сообщения</p>`.  

Например, если надо отправить сообщение для пользователя: «Спасибо за регистрацию на сервисе!», то при отправке через имейл текст преобразуется в: `<p>Спасибо за регистрацию на сервисе!</p>`.  

- Уведомление содержит дополнительные поля: тема сообщения, список адресов получателей.  

**SmsNotification**:  

- Текст для СМС не меняется. Сообщение отправляется в оригинальном формате.
  
Например, если надо отправить сообщение для пользователя: «Спасибо за регистрацию на сервисе!», то при отправке через СМС текст преобразуется в: Спасибо за регистрацию на сервисе!  

- Уведомление содержит дополнительное поле — список телефонных номеров получателей.
  
**PushNotification**:  

- Пуш перед основным текстом сообщения содержит эмодзи 👋 для привлечения внимания.
  
Например, если надо отправить сообщение для пользователя: «Спасибо за регистрацию на сервисе!», то при его отправке через СМС текст преобразуется в: 👋 Спасибо за регистрацию на сервисе!  

- Пуш-уведомление содержит дополнительные поля: заголовок уведомления, аккаунт пользователя (строка).
  
Классы по отправке уведомлений **SmsNotificationSender**, **EmailNotificationSender** и **PushNotificationSender** содержат следующие методы:  

**void send()** с одним аргументом, в который передаётся одно уведомление.   

Метод получает форматированное сообщение из объекта уведомления, дополнительные поля и выводит его в консоль.

**void send()** с одним аргументом, который принимает список уведомлений и распечатывает сообщения и дополнительные поля каждого из них.  

