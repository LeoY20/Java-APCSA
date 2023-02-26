public class Food extends Good { //want to inherit all the properties of good and want to have access to the tax methods as well
    //so, we use extend
    private double calories; //instance variable
    public Food (String des, double pr, double cal) {
        //bc food extends good, it inherits the instance variable from good
        super(des, pr); //way to initialize instance variables from Good
        this.calories = cal; //initialization of instance variable
        //q: do all variables have to be initialized per class in java?

    }

    public double getCalories() {
        return calories;
    }

    @Override //in order to override the calcTax within Good.java
    public double calcTax() {
        return 0 * this.getPrice(); //cuz foods aren't taxed
    }
    //returning tax because it extends on good? ask about this to confirm

    @Override
    public String toString() { //what specifically does toString do?
        return super.toString() + "Calories: " + this.getCalories() + "\n";
        //super.toString is a trick that doesn't need us to rewrite code from above cuz it already exists, ask about this and how it works specifically

    }



}
