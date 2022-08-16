package org.example.model;

public class EmailLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Maile Loglandi!");
    }
}
