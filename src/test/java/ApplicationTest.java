import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    private Application application;
    @BeforeEach
    public void setup(){
        this.application = new Application();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5",
            "6, 8",
            "7, 13",
            "8, 21",
            "9, 34",
            "10, 55",
            "11, 89",
            "12, 144",
            "13, 233",
            "14, 377",
            "15, 610",
            "16, 987",
            "17, 1597",
            "18, 2584",
            "19, 4181",
            "20, 6765",
            "21, 10946",
            "22, 17711",
            "23, 28657",
            "24, 46368",
            "25, 75025",
            "26, 121393",
            "27, 196418",
            "28, 317811",
            "29, 514229",
            "30, 832040",
            "31, 1346269",
            "32, 2178309",
            "33, 3524578",
            "34, 5702887",
            "35, 9227465"
    })
    public void testGetFibonacciAtNumber(int n, int expectedValue) {

        assertEquals(expectedValue, application.getFibonacciNumberAt(n));
    }

}
