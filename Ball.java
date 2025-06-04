import java.util.Scanner;

// Base class
class Ball {
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String showGame() {
        return "Generic Ball";
    }
}

// Derived class: BasketBall
class BasketBall extends Ball {
    public BasketBall(double radius) {
        super(radius);
    }

    @Override
    public String showGame() {
        return "BasketBall";
    }
}

// Derived class: TennisBall
class TennisBall extends Ball {
    public TennisBall(double radius) {
        super(radius);
    }

    @Override
    public String showGame() {
        return "Tennis";
    }
}
