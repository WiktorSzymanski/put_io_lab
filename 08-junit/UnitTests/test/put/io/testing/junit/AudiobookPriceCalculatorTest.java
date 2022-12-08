package put.io.testing.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import put.io.testing.audiobooks.Audiobook;
import put.io.testing.audiobooks.AudiobookPriceCalculator;
import put.io.testing.audiobooks.Customer;

import static org.junit.jupiter.api.Assertions.assertEquals;

//  Pytanie 5.2
//  Metoda calculate posiada 4 ścieżki.

public class AudiobookPriceCalculatorTest {

    static private Audiobook audiobook;
    static private AudiobookPriceCalculator calculator;

    @BeforeAll
    static void audiobookSetUp() {
        audiobook = new Audiobook("TestTitle", 100.0);
        calculator = new AudiobookPriceCalculator();
    }

    @Test
    void testCustomerIsSubscriber() {
        Customer customer = new Customer(
                "TestCustomer",
                Customer.LoyaltyLevel.STANDARD,
                true);

        assertEquals(0.0, calculator.calculate(customer, audiobook));
    }

    @Test
    void testCustomerSilverLoyalityLevel() {
        Customer customer = new Customer(
                "TestCustomer",
                Customer.LoyaltyLevel.SILVER,
                false);

        assertEquals(0.9 * audiobook.getStartingPrice(), calculator.calculate(customer, audiobook));
    }

    @Test
    void testCustomerGoldLoyalityLevel() {
        Customer customer = new Customer(
                "TestCustomer",
                Customer.LoyaltyLevel.GOLD,
                false);

        assertEquals(0.8 * audiobook.getStartingPrice(), calculator.calculate(customer, audiobook));
    }

    @Test
    void testCustomerStandardLoyalityLevel() {
        Customer customer = new Customer(
                "TestCustomer",
                Customer.LoyaltyLevel.STANDARD,
                false);

        assertEquals(audiobook.getStartingPrice(), calculator.calculate(customer, audiobook));
    }
}
