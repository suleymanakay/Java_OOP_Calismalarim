package org.example.model;

public class DatabaseLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Veri tabanina loglandi!");
    }
}
