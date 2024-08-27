package org.example._1_creational_patterns._1_singleton.after;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IOException, NoSuchMethodException, IllegalAccessException, ClassNotFoundException {
        // 싱글톤을 깨트리는 방법1 리플렉션
        Settings4 s1 = Settings4.getInstance();
        Settings4 s2 = Settings4.getInstance();

        Constructor<Settings4> constructor = Settings4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings4 s3 = constructor.newInstance();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        // 싱글톤을 깨트리는 방법2  직렬화 역질렬화
        Settings4_1 s11 = Settings4_1.getInstance();
        Settings4_1 s12 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("s11.obj"))){
            out.writeObject(s11);
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("s11.obj"))) {
            s12 = (Settings4_1) in.readObject();
        }

        System.out.println(s11 == s12);


        // enum
        Settings5 s5 = Settings5.INSTANCE;

        Settings5 s6 = null;

        // 에러
        Constructor<?>[] declaredConstructors = Settings5.class.getDeclaredConstructors();
        for (Constructor<?> cons : declaredConstructors){
            cons.setAccessible(true);
            s6 = (Settings5) cons.newInstance("INSTANCE");
        }

        System.out.println(s5 == s6);

    }


}
