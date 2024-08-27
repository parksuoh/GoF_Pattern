package org.example._1_creational_patterns._1_singleton.after;

import java.io.Serializable;

public class Settings4_1 implements Serializable {
    private Settings4_1() { }

    //inner class 멀티스레드 레이지 로딩 가능
    private static class Settings4Holder {
        private static final Settings4_1 INSTANCE = new Settings4_1();
    }

    public static Settings4_1 getInstance() {
        return Settings4Holder.INSTANCE;
    }

//    밑에와 같은 메소드를 가지고있으면 역질렬화를 막아줌
//    protected Object readResolve(){
//        return getInstance();
//    }

}
