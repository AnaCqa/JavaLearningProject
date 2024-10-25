package md.tekwill.operationsandciclicfunctions;

public class AssignmentOperationsExample {

    public static void main(String[] args) {

        int a = 8;
        int b = 4;

        //Atribuire simpla
        int result = a;
        System.out.println("Atribuire simpla: " + result);

        //Atribuire cu adunare
        result += b;
        System.out.println("Atribuire cu adunare " + result);

        // Atribuire cu scadere
        result -= b;
        System.out.println("Atribuire cu scadere " + result);

        //Atribuire cu inmultire
        result *= b;
        System.out.println("Atribuire cu inmultire " + result);

        //Atribuire cu impartire
        result /= b;
        System.out.println("Atribuire cu impartire " + result);

        //Atribuire cu restul impartirii
        result %= b;
        System.out.println("Atribuire cu restul impartirii " + result);


    }
}
