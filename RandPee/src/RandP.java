//READ instructions for this project
//https://paleyontology.com/AP_CS/randp.html

public class RandP {
    private int[] nums;
    private int numsLeft;

    public RandP(int n) {
        this.nums = new int[n]; //need new to initialize
        this.numsLeft = n;
        initNums(n);
    }


    //Fills an array with consecutive numbers from 1 to nums.length
    private void initNums(int n) { //array works
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
    }


    //swaps locations of two values in an array
    public void swap(int[] arr, int a, int b) {  //swap is buggy af
        int temp1 = a; //is the position of
        int temp2 = arr[b-1]; //numsleft is the number of things in array, last element of array
        arr[a] = temp2;
        arr[b-1] = temp1; //swapping locations
        numsLeft--;
    }

    public int nextInt() { //the method that returns the result
        // Math.random() should never be called more than once when this method is called.
        // Recursion is not allowed.
        // YOUR_CODE_HERE
        if (numsLeft == 0) {
            return 0;
        }
        int num = (int)(Math.random() * numsLeft); //will be position of num that you select
//        System.out.println(num);//will give you rand num from 1 to numsleft
        int temp = nums[num]; //temp = the pos of the num you select
        swap(nums, num, numsLeft);
//        System.out.println("random number: " + temp); // can verify that this works
        return temp;
    }

    public int[] numsGetter() {
        return nums;
    }
}