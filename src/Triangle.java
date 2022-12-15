public class Triangle implements Shapeble{

    private double height, base;

    public Triangle (double height, double base) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return this.height * this.base / 2;
    }
}
