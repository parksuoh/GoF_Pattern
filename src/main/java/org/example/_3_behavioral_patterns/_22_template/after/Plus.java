package org.example._3_behavioral_patterns._22_template.after;

public class Plus implements Operator {
    @Override
    public int getResult(int result, int number) {
        return result += number;
    }
}
