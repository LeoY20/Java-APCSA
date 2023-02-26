import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Primes {

    private ArrayList<Integer> primes = new ArrayList<Integer>(); //initialize empty list
    private int num; // need to initialize lmao

    public Primes(int n) { //constructor
        //initialize primes
        this.num = n; // apparently this is initializing
        //call the initPrimes method
        initPrimes(num);
    }

    public ArrayList<Integer> getPrimes()
    {
        return primes; //getter for primes cuz cannot access private vars
    }

    //methods you need to create // adds n prime numbers to prime
    public void initPrimes(int n) {
        for (int i = n; i != 0; i--) {
            primes.add(nthPrime(i));
        }
        System.out.println(primes);
        nextPrime(n);
    }

    public int nthPrime(int n) {
        int iteration = 0;
        int testNum = 2;
        int finale = 2;
        while (iteration != n) {
            if (primesTest(testNum)) {
                iteration++;
                if (iteration == n) {
                    finale = testNum;
                }
                testNum++;
            }
            else {
                testNum++;
            }
        }
        return finale;
    }

    public int nextPrime(int n) {
        return nthPrime(n + 1);
    }

    public boolean primesTest(int n) { //primestest works?
        int counter = 0; // default will be to output false
        double temp = (double) n;
        double sqrtN = Math.sqrt(temp);
        if (n == 2 || n == 3) {
            return true;
        }
        else if (n == 1) {
            return false;
        }
        //divide by every single number up to sqrt n because that is math
        for (double i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                counter++; // because it is divisible
            }
        }
        if (counter == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPrime(int n) {
        if (n > primes.get(0)) {
            int i = primes.size();
            while (n > primes.get(0) && nextPrime(i) < n) {
                buildPrimes(i);
                i++;
            }
            if (primesTest(n)) {
                return true;
            }
            System.out.println(primes);
        }
        else if (primesTest(n)) {
            return true;
        }
        return false;
    }

    public void buildPrimes(int n) {
        primes.add(0, nthPrime(n+1)); //adding 0 before shifts all elements to right
    }



    //some useful methods for later in the project
    public ArrayList<Integer> get() {
        return primes;
    }

    public int size() {
        return primes.size();
    }

    public int get(int n) {
        return primes.get(n);
    }

}