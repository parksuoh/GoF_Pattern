package org.example._3_behavioral_patterns._15_interpreter.after;

import java.util.Map;

public interface PostfixExpression {

    int interpret(Map<Character, Integer> context);

}
