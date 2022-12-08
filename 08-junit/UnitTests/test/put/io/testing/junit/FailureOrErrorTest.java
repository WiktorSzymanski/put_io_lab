package put.io.testing.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FailureOrErrorTest {

//    Pytanie 4.1
    @Test
    void test1() {
//        Failure
        assertEquals(1, 2);
    }

    @Test
    void test2() {
//        Error
        throw new RuntimeException();
    }

//    Pytanie 4.2
//    JUnit oczekuje obiektu implementującego Error

    @Test
    void test3() {
        try {
            assertEquals(1, 2);
        } catch (Throwable e) {
            System.out.print(e.toString());
        }
    }
}
