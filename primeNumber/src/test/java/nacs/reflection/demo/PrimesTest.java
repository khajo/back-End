package nacs.reflection.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PrimesTest {


    @Autowired
    Primes primes;

    @ParameterizedTest
    @CsvSource({

            "0, false",
            "1, false",
            "2, true",
            "3, true",
            "4, false",
            "5, true",
            "122, false",
    })
    void testIsPrimeNumber(Integer number, Boolean expected) {
        Boolean result = primes.isPrime(number);
        Assertions.assertEquals(expected, result);

    }
}
