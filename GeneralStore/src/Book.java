public class Book extends Good{
    //author
    private String author;
    //constructor
    public Book(String des, String aut, double pr) {
        super(des, pr); //initialization of extended vars
        this.author = aut;
    }

    //getters
    public String getAuthor() {
        return author;
    }

    //toString method
    @Override
    public String toString() {
        return "Title: " + super.getDescription()
                + "\nAuthor: " + this.getAuthor()
                + "\nPrice: " + super.getPrice() + "\n";
    }

}