package com.example.notification;

public class HtmlFormatter implements MessageFormatter {
    @Override
    public String formatMessage(String message) {
        return "<html><body>" + message + "</body></html>"; // Formata como HTML
    }
}
