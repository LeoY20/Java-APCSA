public class Wombat extends Animal{
    public Wombat() {
        this(1800, "Anon Wombat");
    }
    public Wombat(int weight, String name) {
        super(weight, name);
    }

    @Override
    public void eat(int amount) {
        System.out.println("Wombats don't gain weight when they eat!");
    }

    public String toString() {
        return super.toString(); //aka "inherit the toString method from superclass"
    }
}
