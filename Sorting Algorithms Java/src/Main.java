//Document with diagrams about each sorting algorithm
//https://docs.google.com/document/d/1py0c5GCdiK2CV4KXTDEgcoeOKq9kVcGJj36RBk8O5gE/edit

public class Main {

    public static void main(String[] args) {
        int[] nums = {10, 3, 2, 7, 6, 8, 4, 1, 5, 9};
//        bubbleSort(nums);
//        printArray(nums);
//        selectionSort(nums);
//        printArray(nums);
          insertionSort(nums);
        	printArray(nums);
//        printArray(insert(nums, 3, 6));

    }

// YOUR GOAL:
// Write the three methods below.
// Test them by uncommenting each method calls in the main method
// Programmer Tips to Ponder:
// - add variables for assignments and swaps and print them after the method is complete
// - how many comparisons / swaps should we have if the array is already sorted?
// - how many comparisons / swaps should we have if the initial array goes from high to low?
// - add print statements to help see the status of an array after each pass through

    //hint: use a nested for loop!

    public static void printOut(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void swap(int arr[], int pos1, int pos2) {
        int temp = arr[pos1];
        int temp1 = arr[pos2];
        arr[pos1] = temp1;
        arr[pos2] = temp;
    }
    public static void bubbleSort(int arr[]) { // note that (int arr[]) is semantically the same as (int[] arr)
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) { //actual swapping method going in, -j because it accounts for the funny last one being sorted
                if (arr[i] > arr[i + 1]) { //this edits the num array in global? prob right
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    //hint: use a nested for loop!
    public static void selectionSort(int arr[]) {
        //the funny one that has looks for the minimum
        for (int j = 0; j < arr.length - 1; j++) {
            int min = j; //minimum is the first val
//            System.out.println("initial min = " + arr[j]);
            for (int i = (0 + j); i < (arr.length - j); i++) { //to account for already sorted
//                System.out.println("my pos is " + i); //this is working it seems
                if (arr[i] < arr[min]) {
                    min = i; //identify new minimum
//                    System.out.println("my min is " + arr[min]);
                }
            }
            swap(arr, j, min); //there is a chance that min is the same val
            //either way it goes thru entire array, tracks pos of min, swaps
        }
    }

    //hint: use a for loop and while loop!
    public static void insertionSort(int arr[]) { //inserts in "right spot" based on comparison to previous
        for (int j = 0; j < arr.length; j++) { //should cycle thru all
            //compare to previous (start at arr 0, then compare), j = compared num
            //check if greater
//            System.out.println("iteration " + j + ": ");
//            printArray(arr);
            int i = 0; //resets every iteration
            while (arr[i] < arr[j]) { //check between cycled pos i from before values and current
                i++; //skip, already sorted
            }
            //at this point, i is the position that you swap to, j is the pos of the num comparing to
            insert(arr, i, j);
        }
    }

    public static void insert (int arr[], int posIn, int posNum) { //posIn tells position to swap to, NEEDS TO BE VOID RETURN TO ALTER THE ORIGINAL ONE AIYA
        int[] outputArr = new int[arr.length]; //output array, initialization
        //start at pos that you want to insert to
        for (int i = 0; i < arr.length; i++) { //don't need arr.length - 1 cuz it stops at arr.length anyway
            if (i < posIn) { //when you get to the position, set that to arr[j]
                outputArr[i] = arr[i];
            }
            else if (i == posIn) {
                outputArr[i] = arr[posNum];
            }
            else if (i > posIn && i <= posNum) {
                outputArr[i] = arr[i - 1]; //to account for shift
            }
            else {
                outputArr[i] = arr[i];
            }
        }
        //filling original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = outputArr[i];
        }
    }



    //a useful method for printing the contents of an array of ints
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
