package it.unicam.universita.mdp2526.abstractfactory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // factory per le forme normali
        AbstractFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("CIRCLE");
        shape3.draw();

        // factory per le forme arrotondate
        AbstractFactory roundedShapeFactory = new RoundedShapeFactory();

        Shape shape4 = roundedShapeFactory.getShape("RECTANGLE");
        shape4.draw();

        Shape shape5 = roundedShapeFactory.getShape("SQUARE");
        shape5.draw();
    }
}
