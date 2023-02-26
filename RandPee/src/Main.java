//FIRST READ THE INSTRUCTIONS for this project
//https://paleyontology.com/AP_CS/randp.html

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        RandP rand = new RandP(6);
        //Create a loop that prints all the random numbers that you can create from the object
        int temp = rand.nextInt();
        while (temp > 0) {
            System.out.println(temp);
            temp = rand.nextInt(); //call it again so that num refreshes
        }
        System.out.println(0);
    }

    }
