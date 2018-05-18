package quadequations;

/**
 * A type representing an endless set of possible solutions.
 */
public class AnySolution implements Solution {
    @Override
    public String description() {
        return "The equation has infinite set of possible solutions";
    }

    public AnySolution() {}
}
