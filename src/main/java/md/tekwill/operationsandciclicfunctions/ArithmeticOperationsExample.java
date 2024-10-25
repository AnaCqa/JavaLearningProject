package md.tekwill.operationsandciclicfunctions;

public class ArithmeticOperationsExample {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        //Sum
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        System.out.println("The sum is: " + (a + b));

        //Substraction
        int sub = a - b;
        System.out.println("The substraction is: " + sub);
        System.out.println("The substraction is: " + (a - b));

        //Multiplication
        int multi = a * b;
        System.out.println("The sub multiplication: " + multi);
        System.out.println("The sub multiplication: " + (a * b));

        //Division
        double a1 = a;
        double b1 = b;
        double div = a1 / b1;
        System.out.println("The sub division: " + div);
        System.out.println("The sub division: " + (a1 / b1));

        //The rest of devision or Devision with remainder
        int result = a % b;
        System.out.println("The sub division: " + result);
        System.out.println("The sub division: " + (a % b));


        // Schimb de valori

        // a = 5; b = 10
        System.out.println("a = " + a + ", b = " + b);

         /* int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b); */

        // a = 5 + 10 ; a = 15
        a = a + b;
        // b = 15 - 10 ; b = 5
        b = a - b;
        // a = 15 - 5; ; a = 10
        a = a - b;
        // a = 10; b = 5;
        System.out.println("a = " + a + ", b = " + b);


    }

}
