package ru.skillbox.notification;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class PushNotification implements Notification {
    private final String message;
    private String title;
    private String receiver;
    @Override
    public String formattedMessage() {
        return "\ud83d\udc4b" + message;
    }
}
