package Test;

import Main.Calculator;
import org.junit.jupiter.api.*;


import java.util.Random;


class RCalculatorTest {
    Calculator calculator;
    Random random;

    @BeforeEach
    void initTest() {
        calculator = new Calculator();
        random = new Random();
    }

    @AfterEach
    void afterTest() {
        calculator = null;
        random = null;
    }

    @Test
    @DisplayName("Sollte ganze Zahlen addieren")
    void additionIntTest() {
        int numb1 = random.nextInt();
        int numb2 = random.nextInt();
        Assertions.assertEquals(numb1 + numb2, calculator.addition(numb1, numb2));

    }

    @Test
    @DisplayName("Sollte Kommazahlen addieren")
    void additionDoubleTest() {
        double numb1 = random.nextDouble();
        double numb2 = random.nextDouble();
        Assertions.assertEquals(numb1 + numb2, calculator.addition(numb1, numb2));

    }

    @Test
    @DisplayName("Sollte ganze Zahlen subtrahieren")
    void subtractionIntTest() {
        int numb1 = random.nextInt();
        int numb2 = random.nextInt();
        Assertions.assertEquals(numb1 - numb2, calculator.subtraction(numb1, numb2));

    }

    @Test
    @DisplayName("Sollte Kommazahlen subtrahieren")
    void subtractionDoubleTest() {
        double numb1 = random.nextDouble();
        double numb2 = random.nextDouble();
        Assertions.assertEquals(numb1 - numb2, calculator.subtraction(numb1, numb2));
    }

    @Test
    @DisplayName("Sollte nur mit positiven Zahlen rechen können")
    void subtractionNaturalNumberTest() {
        int numb1 = 10;
        int numb2 = -5;
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.subtractionNaturalNumber(numb1, numb2);
        });
    }


    @Test
    @DisplayName("Sollte division Rechner")
    @Disabled
    void divisionNumberTest(){

    }

    @Test
    @DisplayName("Sollte division rechnen durch 0")
    @Disabled
    void divisionZeroTest(){

    }


}