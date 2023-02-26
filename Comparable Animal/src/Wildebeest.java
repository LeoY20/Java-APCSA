public class Wildebeest extends Animal{
    public Wildebeest() {
        this(10000, "joemama");
    }
    public Wildebeest(int weight, String name) {
        super(weight, name); //inherits from superclass
    }
    public String toString() {
        return super.toString(); //aka "inherit the toString method from superclass"
    }
}
