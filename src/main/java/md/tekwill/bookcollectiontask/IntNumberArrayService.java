package md.tekwill.bookcollectiontask;

public class IntNumberArrayService {
    public static int maxIntFromArr(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (maxValue < inputArray[i]) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static double arithmeticOutcomeAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (double) sum / array.length;
    }
}
