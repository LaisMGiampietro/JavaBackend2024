package com.example.notification;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final String emailServer;

    private ConfigurationManager() {
        this.emailServer = "smtp.example.com";
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getEmailServer() {
        return emailServer;
    }
}
