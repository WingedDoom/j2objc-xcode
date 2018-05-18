package quadequations;

/**
 * A model for representing quadratic equations of type A*x^2 + B*x + C = 0.
 */
public class Equation {
    private double coeffA;
    private double coeffB;
    private double coeffC;

    public Equation(double coeffA, double coeffB, double coeffC) {
        this.coeffA = coeffA;
        this.coeffB = coeffB;
        this.coeffC = coeffC;
    }

    private double calculateDiscriminant() {
        return coeffB*coeffB - 4*coeffA*coeffC;
    }

    /**
     * Checks whether the equation has a solution.
     * @return true if the quadratic equation is solvable, false otherwise.
     */
    public boolean isSolvable() {
        return calculateDiscriminant() >= 0;
    }

    public Solution solve() {
        if (!isSolvable()) return null;
        if (coeffB == 0 && coeffA == 0) return new AnySolution();

        double d = calculateDiscriminant();
        double x1 = (-coeffB + Math.sqrt(d)) / 2*coeffA;
        double x2 = (-coeffB - Math.sqrt(d)) / 2*coeffA;

        return new NormalSolution(x1, x2);
    }
}
