public class Circle implements Shapeble{

    private double radius;
    static final float PI = 3.14f;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return this.radius * PI;
    }
}
