// Bag class with fixed-size array
class Bag {
    private Ball[] balls;
    private int count;

    public Bag() {
        balls = new Ball[10]; // Fixed size
        count = 0;
    }

    public void addBall(Ball ball) {
        if (count < balls.length) {
            balls[count] = ball;
            count++;
            System.out.println("Ball added to bag.");
        } else {
            System.out.println("Bag is full.");
        }
    }

    public void removeBall() {
        if (count > 0) {
            count--;
            balls[count] = null;
            System.out.println("Ball removed from bag.");
        } else {
            System.out.println("Bag is already empty.");
        }
    }

    public boolean isBagEmpty() {
        return count == 0;
    }

    public void showGame() {
        if (count == 0) {
            System.out.println("No balls in the bag.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("Game: " + balls[i].showGame() + ", Radius: " + balls[i].getRadius());
            }
        }
    }
}