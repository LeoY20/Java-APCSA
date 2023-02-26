/* Remember the Mobile problem from SICP (problem 2.29)? Here's a solution in Scheme:
https://paleyontology.com/AP_CS/mobile_soln.html
    We will now recreate this in Java! In this version, we'll design the program with Structure as an interface. Here are a few key facts:

·  A mobile has a left and right branch.
·  A branch has a length and structure
·  A structure can be a weight or a mobile.
·  A mobile is balanced if the left and right torques are equal and the sub-mobiles are balanced.
·   Torque is defined as the length of a branch multiplied by its weight

*/

public class Main {

    public static void main(String[] args) {
//Try drawing the mobiles by hand so you can see them
// A simple mobile:
        Branch x = new Branch(5, new Weight(1));
        Branch y = new Branch(6, new Weight(2));
        Mobile z = new Mobile(x, y);

// A larger mobile:
        Branch b7 = new Branch(8, new Weight(1));
        Branch b8 = new Branch(2, new Weight(4));
        Mobile m4 = new Mobile(b7, b8);
        Branch b5 = new Branch(5, new Weight(2));
        Branch b6 = new Branch(2, m4);
        Mobile m3 = new Mobile(b5, b6);
        Branch b3 = new Branch(3, new Weight(4));
        Branch b4 = new Branch(4, new Weight(3));
        Mobile m2 = new Mobile(b3,b4);
        Branch b1 = new Branch(6, m2);
        Branch b2 = new Branch(6, m3);
        Mobile m1 = new Mobile(b1, b2);

// Test cases:
        System.out.println(m1.getWeight()); //Expected 14.0
        System.out.println(m1.isBalanced()); //Expected true

        System.out.println(z.getWeight()); //Expected 3.0
        System.out.println(z.isBalanced()); //Expected false



    }

}
