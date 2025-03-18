package ru.skillbox.notification;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
@Getter
@RequiredArgsConstructor
public class SmsNotification implements Notification {
    private final String message;
    private final ArrayList<String> receivers = new ArrayList<>();

    public void addPhoneNumber(String number) {
        receivers.add(number);
    }

    @Override
    public String formattedMessage() {
        return message;
    }
}
