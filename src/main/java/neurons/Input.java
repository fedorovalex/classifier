package neurons;

public class Input {
    private double x;
    private double w;

    public Input(double x, double w) {
        this.x = x;
        this.w = w;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }
}
