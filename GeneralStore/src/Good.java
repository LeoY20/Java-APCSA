
public class Good implements Taxable {
    //instance variables, always start with these, then they get passed into constructor
    private String description;
    private double price;

    //constructor for a good
    public Good(String des, double pr) {
        this.description = des;
        this.price = pr;
    }

    //getters

    public double calcTax() { //gets stuff from object made from constructor
        return getPrice() * CA_TAX_RATE;
    }
    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override //this tells you that the method exists elsewhere and you are to override the one here or smthn, customization of a method that exists in a superclass or interface
    public String toString() {
        return "item: " + this.getDescription()
                + "\nprice: " + this.getPrice() +
                "\ntax: " + this.calcTax() + "\n"; //\n = escape char
    }

}
