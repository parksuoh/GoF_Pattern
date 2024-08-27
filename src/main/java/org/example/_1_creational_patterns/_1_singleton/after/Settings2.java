package org.example._1_creational_patterns._1_singleton.after;

public class Settings2 {

    // 미리 new 로 만드는방법도 있음 (이른 초기화 - eager initializaion)
    // 미리 만든다는게 비용이 크면 메모리를 많이 사용할수있음
    private static Settings2 instance;

    private Settings2() {}

    // 멀티스레드시 이 메소드에 하나식 접근가능하나 성능이 별로
    public static synchronized Settings2 getInstance() {
        if (instance == null) {
            instance = new Settings2();
        }

        return instance;
    }

}
