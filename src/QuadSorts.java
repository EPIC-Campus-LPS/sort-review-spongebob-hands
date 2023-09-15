public class QuadSorts {

    public static int[] bubbleSort(int[] arr) {

        int[] tempArr = arr;

        for (int j = 0; j < tempArr.length; j++) {

            for (int i = 0; i < tempArr.length - 1; i++) {

                if (tempArr[i] > tempArr[i + 1]) {

                    int temp = tempArr[i];
                    tempArr[i] = tempArr[i + 1];
                    tempArr[i + 1] = temp;

                }

            }

        }

        return tempArr;

    }

    // sorts an integer array from least to greatest by selecting the smallest value from the unsorted portion of the list, and then sorting it in the previously sorted section
    public static int[] selectionSort(int[] arr) {

        // declaring new array
        int[] tempArr = arr;

        for (int i = 0; i < tempArr.length; i++) {
            int lowIndex = i;
            for (int j = i + 1; j < tempArr.length; j++) {
                if (tempArr[j] < tempArr[lowIndex]) {
                    lowIndex = j;
                }
            }

            int temp = tempArr[lowIndex];
            tempArr[lowIndex] = tempArr[i];
            tempArr[i] = temp;

        }

        return tempArr;

    }

    public static int[] insertionSort(int[] arr) {

        int[] tempArr = arr;

        for (int i = 1; i < tempArr.length; i++) {
            int j = i - 1;
            int tempValue = tempArr[i];
            while (j >= 0 && tempArr[j] > tempValue) {
                tempArr[j + 1] = tempArr[j];
                j = j - 1;
            }
            tempArr[j + 1] = tempValue;
        }

        return tempArr;
    }

    // mergeSort sorts an array of integers by separating the array into many length 1 arrays and recombining them in order from least to greatest
    public static int[] mergeSort(int[] arr) {

        // the method will not continue if the array length is less than 2 (because it cannot be split up more)
        if (arr.length < 2) {
            return arr;
        }

        // figures out how long to make each new array
        int midIndex = (arr.length) / 2;

        // creating new arrays
        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[arr.length - midIndex];

        // copying old array into 2 new arrays
        System.arraycopy(arr, 0, leftArr, 0, midIndex);
        System.arraycopy(arr, midIndex, rightArr, 0, arr.length - midIndex);

        // further dividing new arrays
        leftArr = mergeSort(leftArr);
        rightArr = mergeSort(rightArr);

        // merging new arrays
        merge(arr, leftArr, rightArr);

        int[] newArr = arr;

        // returns the sorted array
        return newArr;

    }

    // merge method re-merges the new array sorted from least to greatest
    public static int[] merge(int[] arr, int[] leftArr, int[] rightArr) {

        int leftIndex = 0, rightIndex = 0, sortedIndex = 0;

        // while loop will continue as long as the left index and right index are less than their list's length
        while (leftIndex < leftArr.length && rightIndex < rightArr.length) {

            // if the left array of the left index is  less than the right array of the right index, the left index value will be put into the sorted array at the current index, the left index and sorted index will increase to check the next values
            if (leftArr[leftIndex] <= rightArr[rightIndex]) {
                arr[sortedIndex++] = leftArr[leftIndex++];
                // else the right value at the right index will be added to the sorted array at the current index, and both the current index and right index will increase by 1
            } else {
                arr[sortedIndex++] = rightArr[rightIndex++];
            }

        }

        // when one array has reached its final value, the rest of the remaining array will be added
        while (leftIndex < leftArr.length) {
            arr[sortedIndex++] = leftArr[leftIndex++];
        }
        while (rightIndex < rightArr.length) {
            arr[sortedIndex++] = rightArr[rightIndex++];
        }

        // returns sorted array
        return arr;

    }


}
