package org.example.model;

public class SmsLogger implements Logger{
    @Override
    public void log() {

        System.out.println("Mesaj gönderildi!");
    }
}
