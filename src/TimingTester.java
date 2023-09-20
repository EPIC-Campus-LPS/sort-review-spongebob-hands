public class TimingTester {
    public static void main(String[] args){

        int[] small = {1, 5, 8, 3, 9};

        long startTime = System.currentTimeMillis();

        QuadSorts.bubbleSort(small);

        long endTime = System.currentTimeMillis();

        System.out.print(endTime-startTime);

    }
}
