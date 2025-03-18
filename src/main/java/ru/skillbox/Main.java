package ru.skillbox;

import ru.skillbox.notification.EmailNotification;
import ru.skillbox.notification.PushNotification;
import ru.skillbox.notification.SmsNotification;
import ru.skillbox.notification_sender.EmailNotificationSender;
import ru.skillbox.notification_sender.PushNotificationSender;
import ru.skillbox.notification_sender.SmsNotificationSender;

public class Main {
    public static void main(String[] args) {
        //TODO: написать работу с уведомлениями и удалить эту строку
        EmailNotification email1 = new EmailNotification("Спасибо за регистрацию на сервисе!");
        email1.setSubject("Успешная регистрация!");
        email1.addReceivers("oleg@java.skillbox.ru");
        email1.addReceivers("masha@java.skillbox.ru");
        email1.addReceivers("yan@java.skillbox.ru");
        EmailNotificationSender emailSender1 = new EmailNotificationSender();
        emailSender1.send(email1);

        EmailNotification email2 = new EmailNotification("Ваш электронный адрес был изменен.");
        email2.setSubject("Изменение электронного адреса");
        email2.addReceivers("test_skillbox@mail.ru");
        email2.addReceivers("test@mail.ru");
        email2.addReceivers("qwerty@mail.ru");
        EmailNotificationSender emailSender2 = new EmailNotificationSender();
        emailSender2.send(email2);

        EmailNotification email3 = new EmailNotification("Для вашего аккаунта создана новая заявка");
        email3.setSubject("Новая заявка");
        email3.addReceivers("test@gmail.com");
        email3.addReceivers("kate1234@mail.ru");
        email3.addReceivers("tom@mail.ru");
        EmailNotificationSender emailSender3 = new EmailNotificationSender();
        emailSender3.send(email3);

        SmsNotification sms1 = new SmsNotification("Спасибо за регистрацию на сервисе!");
        sms1.addPhoneNumber("+70001234567");
        SmsNotificationSender smsSender1 = new SmsNotificationSender();
        smsSender1.send(sms1);

        SmsNotification sms2 = new SmsNotification("Для вашего аккаунта создана новая заявка");
        sms2.addPhoneNumber("+79999999999");
        SmsNotificationSender smsSender2 = new SmsNotificationSender();
        smsSender2.send(sms2);

        SmsNotification sms3 = new SmsNotification("Для вас в личном кабинете есть новое предложение");
        sms3.addPhoneNumber("+79991234567");
        SmsNotificationSender smsSender3 = new SmsNotificationSender();
        smsSender3.send(sms3);

        PushNotification push1 = new PushNotification("Спасибо за регистрацию на сервисе!");
        push1.setTitle("Успешная регистрация!");
        push1.setReceiver("oleg@java.skillbox.ru");
        PushNotificationSender pushSender1 = new PushNotificationSender();
        pushSender1.send(push1);

    }
}
