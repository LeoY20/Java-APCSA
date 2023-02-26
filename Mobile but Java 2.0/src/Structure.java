/* With Structure as a class, note that there are not any instance variables.
All we need to do is write the getWeight() and isBalanced() methods.

    NOTE! The java command this instanceOf will be helpful in this class to determine if a structure is a Weight or a Mobile.
    NOTE 2!  Casting will be needed as well.  Example:  ((Weight) this).getWeight();
*/

public class Structure {

//Hey look!  No instance variables!  No constructor! Isn't that odd for a class???

    //write these methods
    public double getWeight() {
        if (this instanceof Weight) {
            return ((Weight) this).getWeight();
        }
        else {
            return ((Mobile) this).left().getWeight() + ((Mobile) this).right().getWeight();
        }
    }


    public boolean isBalanced() {
        if (this instanceof Weight) { //if object is true and stuff, then
            return ((Weight)this).isBalanced(); //cast just for safety
        }
        else {
            return ((Mobile)this).isBalanced();
        }

    }

}
