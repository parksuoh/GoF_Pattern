package org.example._1_creational_patterns._2_factory_method.after;

public class BlackshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
