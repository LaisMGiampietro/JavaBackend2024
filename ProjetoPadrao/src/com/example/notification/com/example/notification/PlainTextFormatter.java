package com.example.notification;

public class PlainTextFormatter implements MessageFormatter {
    @Override
    public String formatMessage(String message) {
        return message; // Formata como texto simples
    }
}
