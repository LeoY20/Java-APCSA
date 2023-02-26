public class Mobile extends Structure {
    private Branch left;
    private Branch right;

    //complete the constructor and methods
    public Mobile(Branch left, Branch right) {
        this.left = left;
        this.right = right;
    }

    public Branch left() {
        return left;
    }

    public Branch right() {
        return right;
    }

    public double getWeight() {
        return left.getStructure().getWeight() + right.getStructure().getWeight();

    }

    public boolean isBalanced() {
        return left.getStructure().getWeight() == right.getStructure().getWeight();
    }
}
