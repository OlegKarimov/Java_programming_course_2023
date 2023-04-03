import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathOperationsTest {

    private MathOperations MathOperations;

    // arrange - обустраиваем начало теста
    @BeforeEach
    public void setUp() {
        MathOperations = new MathOperations(); // создаем экземпляр тестируемого класса перед каждым тестом
    }

    @Test
    @DisplayName("Test isPrime method")
    public void testIsPrime() throws IncorrectNumberException {
        assertTrue(MathOperations.isPrime(13)); // ожидаю true при числе 13
        assertFalse(MathOperations.isPrime(121)); // ожидаю false при числе 121
        assertTrue(MathOperations.isPrime(2));
        assertTrue(MathOperations.isPrime(3));
    }

    @Test
    @DisplayName("Test faktorial method")
    public void testFactorial() {
        assertEquals(120, MathOperations.faktorial(5), "5! = 120");
    }

    @Test
    @DisplayName("Тест чет/нечет")
    public void testIsEven() {
        assertTrue(MathOperations.isEven(40));
        assertTrue(MathOperations.isEven(16));
        assertFalse(MathOperations.isEven(13));
    }


}