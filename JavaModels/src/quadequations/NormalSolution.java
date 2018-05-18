package quadequations;

public class NormalSolution implements Solution {
    private double x1;
    private double x2;

    public NormalSolution(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    @Override
    public String description() {
        return "The equation has roots x1 = " + x1 + ", and x2 = " + x2;
    }
}
