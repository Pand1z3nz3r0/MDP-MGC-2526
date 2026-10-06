package it.unicam.universita.mdp2526.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        }
        return new ShapeFactory();
    }
}
