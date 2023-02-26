import java.util.ArrayList;

public class Brilliant {
    ArrayList<Integer> brilliants =  new ArrayList<Integer>();//initialize this
    public Brilliant(int n) {
        initBrilliants(n);
        System.out.println(brilliants);

    }

//methods you will create
public static ArrayList<Integer> getPrimeFactors(int n) {
    ArrayList<Integer> factors =  new ArrayList<Integer>();
    int tempvar = 2;
    while (n > 1) {
        if (n % tempvar == 0) {
            factors.add(tempvar);
            n /= tempvar;
            tempvar = 2;
        }
        else {
            tempvar++;
        }
    }
    return factors;
}
    public static int countDigits(int n) {
        int counter = 0;
        while (n > 0) { //funny int, /10 to decimal will round to 0
            n /= 10;
            counter++;
        }
        return counter;
    }
    public static boolean isBrilliant (int n) {
        if (getPrimeFactors(n).size() == 2 && countDigits(getPrimeFactors(n).get(0)) == countDigits(getPrimeFactors(n).get(1))) {
            return true;
        }
        return false;
    }

    public void initBrilliants(int n) {

         //ur never going to have more prime factors than primes
        getPrimeFactors(n);
        int i = 4;
        while (brilliants.size() != n) {
            if (isBrilliant(i) == true) {
                brilliants.add(i);
            }
            i++;
        }
        nextBrilliant();
    }

    public int nextBrilliant() {
        int n = brilliants.get(brilliants.size() - 1) + 1; //get origin
        while (isBrilliant(n) == false) {
            n++; //should go thru all iterations of n until it finds brilliant num
        }
//        System.out.println("nextbril: " + isBrilliant(n) + " " + n);
        return n;
    }


//some helpful methods
    public ArrayList<Integer> getBrilliants() {
		return brilliants;
	}

	public int size() {
		return brilliants.size();
	}
}
