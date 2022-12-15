public class Main {
    public static void main(String[] args) {
        double triangleArea, circleArea;

        Triangle triangle = new Triangle(4, 2);
        Circle circle = new Circle(4);

        ShapebleCalculator shapebleCalculator = new ShapebleCalculator();

        triangleArea = shapebleCalculator.calculate(triangle);
        circleArea = shapebleCalculator.calculate(circle);

        System.out.printf("Circle area:  %.2f \n", circleArea);
        System.out.printf("Triangle area: %.2f \n", triangleArea);
    }
}