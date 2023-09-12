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

    public static int[] selectionSort(int[] arr) {
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

        for (int i = 0; i < tempArr.length; i++) {

            int tempValue = tempArr[i];

            for (int j = i; j >= 0; j--) {

                if (tempArr[i] < tempArr[j]) {

                    tempArr[j+1] = tempArr[j];

                } else if (tempArr[i] > tempArr[j]) {

                    tempArr[j+1] = tempValue;

                }

            }

        }

        return tempArr;

    }

}
