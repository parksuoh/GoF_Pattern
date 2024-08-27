package org.example._1_creational_patterns._1_singleton.after;

public class Settings3 {

    private static volatile Settings3 instance;

    private Settings3() {}


    // 더블 체크 라킹
    public static Settings3 getInstance() {
        if (instance == null) {
            synchronized ( Settings3.class){
                if (instance == null) {
                    instance = new Settings3();
                }
            }
        }

        return instance;
    }

}
