//READ the project instructions
//https://paleyontology.com/AP_CS/Comparable_Animals.html
//You'll also need to create several other animals that extend Animal

public class Animal implements Comparable<Animal> {

    public int weight;
    public String name;

    public Animal() {
        this(1800, "Anonymous Animal");
    }

    public Animal(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public void eat(int amount) {
        this.weight += amount;
    }


    public int getWeight() {
        return weight;
    }


    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Animal otherAnimal) {
        // TODO Auto-generated method stub
        return (weight - otherAnimal.getWeight()); //will return pos/neg stuff, compareto compares objects, ONLY WEIGHT, NOT LIKE MUTABLE LIST
    }

    public String toString() {
        return this.name + ":" + this.weight + " ";
    }

}
