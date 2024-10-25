package md.tekwill.operationsandciclicfunctions;

public class IncrementDecrement {

    public static void main(String[] args) {

        int a = 5;

        // Incrementare
        a++;
        System.out.println("Valoarea dupa incrementare: " + a);
        int b = a++;
        System.out.println("b = " + b + " a = " + a);

        //Incrementarea pre-fixata
        ++a;
        System.out.println("Valoarea dupa incrementare pre-fixata " + a);
        int c = ++a;
        System.out.println("c = " + c + " a = " + a);

        //Decrementare
        a--;
        System.out.println("Valoarea dupa decrementare " + a);
        int d = a--;
        System.out.println("d = " + d + " a = " + a);

        //Decrementarea pre-fixata
        --a;
        System.out.println("Valoarea dupa decrementare pre-fixata " + a);
        int e = --a;
        System.out.println("e = " + e + " a = " + a);


    }
}
