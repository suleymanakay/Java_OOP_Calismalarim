package org.example.model;

public class FileLogger implements Logger{
    @Override
    public void log() {

        System.out.println("Dosyaya loglandi!");
    }
}
