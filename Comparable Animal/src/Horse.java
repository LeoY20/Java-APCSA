public class Horse extends Animal {
    //default constructor
    public Horse() {
        this(1000, "bob"); //default constructor, use this because is object
    }
    public Horse(int weight, String name) {
        super(weight, name); //does the this stuff because inherits from Animal
    }
    @Override
    public String toString() {
        return super.toString(); //aka "inherit the toString method from superclass"
    }
}
