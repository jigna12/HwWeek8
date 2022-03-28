package homework08;

public class Pro18SumCalculator {
    private double firstNumber;
    private double secondNumber;

    public static void calculator() {
        Pro18SumCalculator calculator = new Pro18SumCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setsecondNumber(4);
        System.out.println("addition :" + calculator.getAdditionResult());
        System.out.println("subtraction :" + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setsecondNumber(0);
        System.out.println("multiplication :" + calculator.getMultiplicationResult());
        System.out.println("division :" + calculator.getDivisionResult());
    }

    // get method
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setsecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return this.secondNumber = 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
    public static void main(String[] args) {
        calculator();
    }
}