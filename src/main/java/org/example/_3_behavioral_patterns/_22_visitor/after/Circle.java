package org.example._3_behavioral_patterns._22_visitor.after;

public class Circle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
