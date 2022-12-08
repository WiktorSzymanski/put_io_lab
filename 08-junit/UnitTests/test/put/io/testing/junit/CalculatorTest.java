package put.io.testing.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static private Calculator calculator;

    @BeforeAll
    static void setUp() {
        calculator = new Calculator();
    }

//    Pytanie 3.1
//    Po zmienieniu "setUp()" i "calculator" na statyczne, w naszym przypadku nie robi to różnicy
//    którego używamy. W sytuacji gydby metody zmieniały atrybuty klasy, mogło (i pewnie miało)
//    by to mieć negatywy wpływ na nasze testy (nie były by one miarodajne).

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "2, 3, 5",
            "5, 5, 10"
            })
    void testAdd(int x, int y, int expectedOutput) {
        assertEquals(expectedOutput, calculator.add(x,y));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 2",
            "2, 3, 6",
            "5, 5, 25"
    })
    void testMultiply(int x, int y, int expectedOutput) {
        assertEquals(expectedOutput, calculator.multiply(x,y));
    }

    @ParameterizedTest
    @CsvSource({
            "-1,  1",
            " 1, -1"
    })
    void testAddPositiveNumbers(int x, int y) {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.addPositiveNumbers(x, y);
        });
    }
}