/**
 * Times 4 sorting algorithms and returns results for each
 *
 * @author Connor Bonn and Marie Viita
 * @version 1.0, 09/20/2023
 */
public class TimingTester {
    public static void main(String[] args){

        //creates new array of size user chooses
        int[] arr = new int[50000000];

        // randomizes each value in array
        for(int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 1000 + 1);

        }

        // records start time
        long bubbleST = System.currentTimeMillis();
        // sorts
        QuadSorts.bubbleSort(arr);
        // records end time
        long bubbleET = System.currentTimeMillis();
        // prints the time it took to sort
        System.out.println("Bubble Sort: " + (bubbleET - bubbleST));

        // randomizes array
        for(int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 1000 + 1);

        }

        // repeats for each sorting algorithm
        long selectionST = System.currentTimeMillis();
        QuadSorts.selectionSort(arr);
        long selectionET = System.currentTimeMillis();
        System.out.println("Selection Sort: " + (selectionET - selectionST));

        for(int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 1000 + 1);

        }

        long insertST = System.currentTimeMillis();
        QuadSorts.insertionSort(arr);
        long insertET = System.currentTimeMillis();
        System.out.println("Insertion Sort: " + (insertET - insertST));

        for(int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * 1000 + 1);

        }

        long mergeST = System.currentTimeMillis();
        QuadSorts.mergeSort(arr);
        long mergeET = System.currentTimeMillis();
        System.out.println("Merge Sort: " + (mergeET - mergeST));

    }
}
