
public class Animal implements Runnable {

    String name;
    int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal says yum");
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Animal runs!!");

    }

    public void meow() {
        System.out.println("animal says meow");
    }
}
