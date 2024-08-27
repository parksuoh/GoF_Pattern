package org.example._2_structural_patterns._7_bridge.after;

import org.example._2_structural_patterns._7_bridge.before.Skin;

public interface Champion extends Skin {

    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();

}
