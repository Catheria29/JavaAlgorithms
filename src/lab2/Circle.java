package lab2;

public class Circle extends Shape {
    private double radius;
    private double x, y;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getX() {
        return x;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + String.format("%.2f", radius) +
                " Centered at X: " + String.format("%.2f", x) + " Y: " + String.format("%.2f", y);
    }
}
