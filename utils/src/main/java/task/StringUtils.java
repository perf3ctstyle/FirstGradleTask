package task;

import static org.apache.commons.lang3.StringUtils.isEmpty;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        double number;
        if (isEmpty(str)) {
            return false;
        } else {
            number = Double.parseDouble(str);
        }

        return number > 0;
    }
}