package com.example.notification;

public class NotificationService {
    private final MessageFormatter formatter;

    public NotificationService(MessageFormatter formatter) {
        this.formatter = formatter;
    }

    public void sendEmail(String recipient, String message) {
        String formattedMessage = formatter.formatMessage(message);
        String emailServer = ConfigurationManager.getInstance().getEmailServer();
        System.out.println("Sending email to " + recipient);
        System.out.println("Using server: " + emailServer);
        System.out.println("Message: " + formattedMessage);
    }

    public void sendSMS(String phoneNumber, String message) {
        String formattedMessage = formatter.formatMessage(message);
        System.out.println("Sending SMS to " + phoneNumber);
        System.out.println("Message: " + formattedMessage);
    }
}
