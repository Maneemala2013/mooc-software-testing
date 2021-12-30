package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher test;
    @BeforeEach
    public void initialize() {
        test = new CaesarShiftCipher();
    }
    @ParameterizedTest
    @CsvSource({"xYz,4,invalid", "x 3,3,invalid"})
    public void invalid(String message, int shift, String expectedResult) {
        String result = test.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({"exc,3,haf","exc,27,fyd","xyz,-1,wxy","xyz,-27,wxy"})
    public void valid(String message, int shift, String expectedResult) {
        String result = test.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
