package org.example._3_behavioral_patterns._22_visitor.after;

public class Rectangle implements Shape {


    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
