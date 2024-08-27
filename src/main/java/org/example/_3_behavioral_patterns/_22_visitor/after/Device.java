package org.example._3_behavioral_patterns._22_visitor.after;

public interface Device {
    void print(Circle circle);

    void print(Rectangle rectangle);

    void print(Triangle triangle);
}
