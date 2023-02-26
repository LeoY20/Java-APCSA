
public class Main {

    public static void main(String[] args) {

        //a is a variable that holds a reference to an Animal
        Animal a = new Animal("Dog", 15);

        //b is a variable that holds a reference to an Animal. Note that a Cat is an Animal.
        Animal b = new Cat("Garfield", 20);

        //r, s, z are variables that hold references to Runnables.  Note that objects stored in memory must implement the Runnable interface for this to work!
        Runnable r = new Cat("Schrodinger", 0);
        Runnable s = new Animal("Snoopy", 10);
        Runnable z = new Sheep("bob", 10);


//      predict the output for each then run the code to test. Add comments to help you remember what
//      happened or note interesting discoveries.

//	    a.eat(); //animal says yum
//		b.eat(); //cat says yum
//		b.meow(); //cat says meow

//		Now do the following
//          comment out: eat() method in Animal
//          uncomment:  eat() in Cat class
//      predict the output for each then run the code to test
	    //a.eat(); //error because no eat method for animal class
		//b.eat(); //error because java will look for the eat method in animal class, then go down into superclass and look for the most specific eat method
        //moral = method has to exist in superclass for subclass methods to work at all


//		Now do the following
//          uncomment: eat() method in Animal
//          comment out:  eat() in Cat class
//	    a.eat(); //works, eats because exists in animal class
//		b.eat(); //returns the animal class eat because looks for most specific, which is the animal eat

//		Now make sure that the meow() method in Cat is uncommented out
//      predict the output for each then run the code to test
		b.meow(); //animal says meow
		b.run(); //cat runs
		a.run(); //animal runs
		r.run(); //returns Cat runs cuz it goes to most specific
		s.run(); //s is an animal, just showing that runnable s is an animal, works because runnable is the highest as everything inherits from it
        //why void tho
//		r.eat(); //doesn't work because no eat in runnable
//		r.meow(); //no meow in
//  	z.run();
//  	z.meow();


//uncomment below and see what happens when you run the code
//Animal j = new Runnable();

//uncomment below and see what happens when you run the code
//Cat z = new Animal("Wildebeest", 20);



    }

}
