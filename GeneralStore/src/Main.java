import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

// 		Create an ArrayList called inventory that holds Good objects
        Good g = new Good("5s on AP Test", 10000); //new good object

        Food f = new Food("Canteloupe", 25, 100); //new food object created in main //not taxable

        Book b = new Book("Never Gonna Give You Up", "Rick Astley", 12345);

        ArrayList<Good> inventory = new ArrayList<>();
        inventory.add(g); //adding to arraylist
        inventory.add(f);
        inventory.add(b);



//      Create a for each loop that prints out each element of inventory
        for (Good good : inventory) { //enhanced for loop that iterates thru all items in list
            System.out.println(good); //don't put anything in this
        }


//		Now create an array that holds of Taxable objects
        ArrayList<Taxable> taxables = new ArrayList<Taxable>();
        taxables.add(g);
        taxables.add(b);

//      Now print the elements in the array
        for (Taxable taxable: taxables) {
            System.out.println(taxable); // implements interface -> is a taxable?
        }


    }


    //  A clever way to print the array.
    public static void printArray(Object[] objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

}
