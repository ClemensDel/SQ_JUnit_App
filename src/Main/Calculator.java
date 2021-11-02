package Main;

public class Calculator {

    public int addition(int number1, int number2) {
        return number1 + number2;
    }

    public double addition(double number1, double number2) {
        return number1 + number2;
    }

    public int subtraction(double number1, double number2) {
        return (int) (number1) - (int) (number2);
    }

    public int subtractionNaturalNumber(int number1, int number2) throws ArithmeticException {
        if (number1 <= 0 || number2 <= 0) {
            throw new ArithmeticException("Negative Zahl");
        } else if (number1 - number2 <= 0) {
            throw new ArithmeticException("Negative Zahl");
        } else {
            return number1 - number2;
        }
    }


    public int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public float division(int number1, int number2) {
        return number1 / number2;
    }

    public double division(double number1, double number2) {
        return number1 / number2;
    }

}
