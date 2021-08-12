package task;

import static org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        Double possibleNumber = NumberUtils.createDouble(str);
        return possibleNumber != null && possibleNumber > 0;
    }
}