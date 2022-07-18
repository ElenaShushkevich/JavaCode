package simpleCalculator;

public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        System.out.println(calc.getFirstNumber());
        System.out.println(calc.getSecondNumber());
        calc.setFirstNumber(9.3);
        calc.setSecondNumber(9.1);
        System.out.println(calc.getAdditionResult());
        System.out.println(calc.getSubtractionResult());
        System.out.println(calc.getMultiplicationResult());
        System.out.println(calc.getDivisionResult());
    }

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber= firstNumber;
    }
    public void setSecondNumber (double secondNumber){
        this.secondNumber= secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult(){
        return secondNumber-firstNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}
