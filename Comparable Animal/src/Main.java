import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Create an array of various animals
        Animal[] animals = { new Horse(2000, "Hulk"),
                new Wombat(),
                new Wombat(1600, "Bessie"),
                new Cow(1700, "Moohead"),
                new Wombat(),
                new Wildebeest(1900, "Big Time Jones") };



        //print the animal array (hint: have you overriden the toString() method in the Animal class?)
        printArray(animals);
        //create a for each loop that causes every animal in the array to eat 200 units of food
        for (Animal a : animals) {
            a.eat(200);
        }


        //sort the animals using Arrays.sort
        Arrays.sort(animals); //arrays.sort uses compareTo

        //print the Animal array again.  They should be sorted (assumimg you've written compareTo correctly in the Animal class.)
        printArray(animals);

    }


    //complete this method
    public static void printArray(Animal[] animals)
    {
        for (Animal a: animals) {
            System.out.print(a.toString()); //print because you don't want new line, a.toString because you want string rep of obj
        }
        System.out.println(); //prints out new blank line
    }
}
