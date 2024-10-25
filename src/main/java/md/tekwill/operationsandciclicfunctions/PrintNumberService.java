package md.tekwill.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int start = 0;
        int stop = 500;

        int whileCounter = start;

        // Instructiunea ciclica while
        while (whileCounter < stop) {
            System.out.print(whileCounter + " , ");
            //  whileCounter++;
            whileCounter += 2;
        }

        System.out.println();
        // Instructiunea ciclica  do while
        do {
            System.out.println(whileCounter);
        } while (whileCounter > stop);

        // Instructiunea ciclica  do while
        do {
            System.out.print(whileCounter + " , ");
            whileCounter--;
        } while (whileCounter > start);

        System.out.println();

        // Instructiunea ciclica  for
        for (int i = start; i < stop; i++) {
            System.out.print(i + " , ");
        }

        System.out.println();

        //Sum if the numbers between start and stop that are divisible by 5
        int sum = 0;
        for (int i = start; i < stop; i++) {
            if (i % 5 == 0) {
                sum = sum + i;
                System.out.println("For i = " + i + " the sum is " + sum);
            }
        }
        System.out.println("The sum of numbers divisible by 5 from the allocated number range is " + sum);
    }
}
