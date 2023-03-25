import java.util.Arrays;

// This is an enrichment task.
// If you're working on this it means you're ahead in the class.

class QuickSort { // public = should be declared in other class file
    public static void main(String[] args) {

        int[] z = { 3, 9, 7, 1, 8, 2, 10, 4, 5, 6 };

        quicksort(z);

        System.out.println(Arrays.toString(z));

    }


    public static void quicksort(int[] a) {
        quick(a, 0, a.length-1);
    }

//itemfromright smaller than pivot
    //itemfromleft larger than pivot
    //swap two

    public static void quick(int[] a, int left, int right) {

        if (right > left) {


            int pivotPos = partition(a, left, right); //left = low, right = high

                //call quick on left partition
//            System.out.println("left partition");
            quick(a, left, pivotPos); //before pivot -> pivot is pivotPos + 1

                //call quick on right partition
//            System.out.println("right partition");
            quick(a, pivotPos + 2, right); //after pivotPos


        }

    }











    public static int partition(int[] a, int left, int right) { //left min index, right upper pivot

        int splitPos = left - 1; //this is the I thing I think???
        for (int j = left; j < right; j++) { //right should be the index, going up to the index, will never reach it
            if (a[j] < a[right]) {
                splitPos++;
//                System.out.println("i = " + splitPos);
                swap(a, splitPos, j);
            }
        }

        swap(a, splitPos + 1, right);
        return splitPos; //not the problem apparently

    }


    public static void swap(int[] a, int i, int j) { //swap method, must be void to edit the array itself

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }



}