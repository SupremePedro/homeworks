package ua.com.alevel;

public class Application {
    public static void main(String[] args) {
        System.out.println("Calculator started...");

        int firstArg = 100;
        int secondArg = 21;

        int answerSum = getSum(firstArg, secondArg);

        int answerSubstruct = getSubstruct(firstArg, secondArg);

        int answerMultiply = getMultiply(firstArg, secondArg);

        int answerDivision = getDivision(firstArg, secondArg);

        System.out.println(answerSum + " " + answerSubstruct + " " + answerMultiply + " " + answerDivision);

        double mySin = TrygonometricCalculator.getSinus(firstArg);

        double myCos = TrygonometricCalculator.getCosine(firstArg);

        System.out.println(mySin + "  " + myCos);
        System.out.println(TrygonometricCalculator.getSinSquare(firstArg)+ "  "+ TrygonometricCalculator.getCosineSquare(firstArg) + " =" + (myCos*myCos+mySin*mySin));
        System.out.println(5<1?"true":"False");
    }

    public static int getSum(int firstArg, int secondArg) {
        return firstArg + secondArg;
    }

    public static int getSubstruct(int firstArg, int secondArg) {
        return firstArg - secondArg;
    }

    public static int getMultiply(int firstArg, int secondArg) {
        return firstArg * secondArg;
    }

    public static int getDivision(int firstArg, int secondArg) {
        return firstArg / secondArg;
    }

}
