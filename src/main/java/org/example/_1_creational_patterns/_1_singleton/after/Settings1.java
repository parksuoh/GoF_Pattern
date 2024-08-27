package org.example._1_creational_patterns._1_singleton.after;

public class Settings1 {
    private static Settings1 instance;

    private Settings1() {}

    public static Settings1 getInstance() {
        if (instance == null) {
            instance = new Settings1();
        }

        return instance;
    }

}
