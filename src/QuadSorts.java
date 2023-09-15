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
            //Repeats while j is greater than or equal to 0 and index j is more than the index in-front of it
            while (j >= 0 && tempArr[j] > tempValue) {
                //Moves the index down one
                tempArr[j + 1] = tempArr[j];
                j = j - 1;
            }
            tempArr[j + 1] = tempValue;
        }

        return tempArr;
    }

    public static int[] mergeSort(int[] arr) {

        if(arr.length < 2) {
            return arr;
        }

        int midIndex = (arr.length)/2;

        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[arr.length-midIndex];

        System.arraycopy(arr, 0, leftArr, 0, midIndex);
        System.arraycopy(arr, midIndex, rightArr, 0, arr.length-midIndex);

        leftArr = mergeSort(leftArr);
        rightArr = mergeSort(rightArr);

        merge(arr, leftArr, rightArr);

        int[] newArr = arr;

        return newArr;

    }

    public static int[] merge(int[] arr, int[] leftArr, int[] rightArr) {

        int leftIndex = 0, rightIndex = 0, sortedIndex = 0;

        while(leftIndex < leftArr.length && rightIndex < rightArr.length) {

            if(leftArr[leftIndex] <= rightArr[rightIndex]) {
                arr[sortedIndex++] = leftArr[leftIndex++];
            } else {
                arr[sortedIndex++] = rightArr[rightIndex++];
            }

        }

        while (leftIndex < leftArr.length) {
            arr[sortedIndex++] = leftArr[leftIndex++];
        }

        while (rightIndex < rightArr.length) {
            arr[sortedIndex++] = rightArr[rightIndex++];
        }

        return arr;

    }


}
