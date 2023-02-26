import java.util.ArrayList;

public class Main {

    public static Primes p = new Primes(50); // new object primes
    public static Brilliant b = new Brilliant(20);


    public static void main(String[] args) {
//        System.out.println(p.isPrime(26));
//        System.out.println(isBrilliant(20));
//        System.out.println(b.isBrilliant(20));
    }

    //static methods out here
    public static boolean isPrime(int n) {
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


    public static int countDigits(int n) {
        int counter = 0;
        while (n > 0) { //funny int, /10 to decimal will round to 0
            n /= 10;
            counter++;
        }
        return counter;
    }
    public static ArrayList<Integer> fz (int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        while (isPrime(n) == false && n > 1) {
            for (int i: p.getPrimes()) { //doesn't matter, just cycling thru list, more inefficient but idc. will not add when it inevitably reaches 1
                if (n % i == 0) {
                    n = n / i;
                    temp.add(i);
                }
            }
        }
        if (isPrime(n) == true) { // //this is in case it ends up with 1 at the end
            temp.add(n);
        }
        return temp;
    }
    public static boolean isBrilliant(int n) {
        boolean listCheck = false;
        boolean numsCheck = false;
        if (fz(n).size() == 2) {
            listCheck = true;
        }
        if (countDigits(fz(n).get(0)) == countDigits(fz(n).get(1))) {
            numsCheck = true;
        }
        if (listCheck == true && numsCheck == true) {
            return true;
        }
        return false;
    }
}