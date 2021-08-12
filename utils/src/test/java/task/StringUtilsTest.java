package task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    private final StringUtils classUnderTest = new StringUtils();

    @Test
    public void isPositiveNumberReturnsTrueWhenGivenPositiveNumber() {
        String positiveNumber = "30";
        boolean result = classUnderTest.isPositiveNumber(positiveNumber);
        assertTrue(result);
    }

    @Test
    public void isPositiveNumberReturnsFalseWhenGivenNegativeNumber() {
        String negativeNumber = "-20";
        boolean result = classUnderTest.isPositiveNumber(negativeNumber);
        assertFalse(result);
    }
}
