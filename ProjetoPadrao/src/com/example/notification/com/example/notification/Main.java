package com.example.notification;

public class Main {
    public static void main(String[] args) {
        MessageFormatter plainTextFormatter = new PlainTextFormatter();
        NotificationService notificationService = new NotificationService(plainTextFormatter);
        notificationService.sendEmail("user@example.com", "Hello, World!");
        notificationService.sendSMS("1234567890", "Hello, World!");

        MessageFormatter htmlFormatter = new HtmlFormatter();
        notificationService = new NotificationService(htmlFormatter);
        notificationService.sendEmail("user@example.com", "Hello, <b>World</b>!");
        notificationService.sendSMS("1234567890", "Hello, <b>World</b>!");
    }
}
