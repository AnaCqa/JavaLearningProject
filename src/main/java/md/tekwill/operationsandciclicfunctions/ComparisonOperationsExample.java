package md.tekwill.operationsandciclicfunctions;

public class ComparisonOperationsExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        //Egal cu
        boolean isEqual = a == b;
        System.out.println("Egal cu: " + isEqual);

        //Diferit de
        boolean isNotEqual = a != b;
        System.out.println("Egal cu: " + isNotEqual);

        //Mai mare decit
        boolean isGreaterThan = a > b;
        System.out.println("Mai mare decit: " + isGreaterThan);

        //Mai mic  decit
        boolean isLessThan = a < b;
        System.out.println("Mai mare decit: " + isLessThan);

        //Mai mare sau egal cu
        boolean isGreaterThanOrEqual = a >= b;
        System.out.println("Mai mare decit: " + isGreaterThanOrEqual);

        //Mai mic  sau egal cu
        boolean isLessThanOrEqual = a <= b;
        System.out.println("Mai mare decit: " + isLessThanOrEqual);

    }
}
