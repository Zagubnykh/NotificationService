package ru.skillbox.notification;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
@RequiredArgsConstructor
public class EmailNotification implements Notification{
    private final String message;
    private String subject;
    private final ArrayList<String> receivers = new ArrayList<>();

    public void addReceivers(String receiver) {
        receivers.add(receiver);
    }

    @Override
    public String formattedMessage() {
        return "<p>" + message + "</p>";
    }
}
