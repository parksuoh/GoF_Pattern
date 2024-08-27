package org.example._1_creational_patterns._1_singleton.before;

public class App {

    public static void main(String[] args) {
        Settings settings = new Settings();
        Settings settings1 = new Settings();

        System.out.println(settings != settings1);
    }

}
