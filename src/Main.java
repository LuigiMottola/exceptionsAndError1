public class Main {
    public static void main(String[] args) {
        int testNumber = 17;
        int min = 2;
        int max = 6;

        System.out.println(integerIntervalController(testNumber, min, max));
    }
    public static boolean integerIntervalController(int num, int extremeInf, int extremeSup){
        if (num > extremeInf && num < extremeSup){
            return true;
        } else {
            throw new ArithmeticException("Error, number not in scope");
        }
    }
}
