public class Cow extends Animal {
    public Cow() {
        this(1800, "John");
    }
    public Cow(int weight, String name) {
        super(weight, name);
    }
    public String toString() {
        return super.toString(); //aka "inherit the toString method from superclass"
    }
}
