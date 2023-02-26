public class Weight extends Structure {
    private double weight;

    //complete the constructor and methods
    public Weight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isBalanced() {
        return true; //weights always balanced

    }
}