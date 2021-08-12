package task;

import static org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    private static final String MINUS = "-";
    private static final String ZERO = "0";

    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isCreatable(str) && (!str.startsWith(MINUS)) && (!str.startsWith(ZERO));
    }
}