package org.example._1_creational_patterns._1_singleton.after;

public class Settings4 {
    private Settings4() { }

    //inner class 멀티스레드 레이지 로딩 가능
    private static class Settings4Holder {
        private static final Settings4 INSTANCE = new Settings4();
    }

    public static Settings4 getInstance() {
        return Settings4Holder.INSTANCE;
    }

}
