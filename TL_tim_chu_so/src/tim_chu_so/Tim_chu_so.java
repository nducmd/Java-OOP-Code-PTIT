package tim_chu_so;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author nducmd
 */
public class Tim_chu_so {

    public static void main(String[] args) {

        for (int jj = 3; jj <= 220; jj++) {
            long a = jj;
            // Setting precision for square root 0f 11. str contain string like 0.00001
            StringBuffer str = new StringBuffer("0.");
            for (long i = 1; i <= a; i++) {
                str.append('0');
            }
            str.append('1');

            // Calculating square root of 11 having precision equal to number enter
            // by the user.
            BigDecimal num = new BigDecimal("5"), precision = new BigDecimal(
                    str.toString()), guess = num.divide(new BigDecimal("2")), change = num
                    .divide(new BigDecimal("4"));
            BigDecimal TWO = new BigDecimal("2.0");
            BigDecimal MinusOne = new BigDecimal("-1"), temp = guess
                    .multiply(guess);
            while ((((temp).subtract(num)).compareTo(precision) > 0)
                    || num.subtract(temp).compareTo(precision) > 0) {

                guess = guess.add(((temp).compareTo(num) > 0) ? change
                        .multiply(MinusOne) : change);

                change = change.divide(TWO);
                temp = guess.multiply(guess);
            }

            // Calculating the (4+sqrt(11))^n
            BigDecimal deci = BigDecimal.ONE;
            BigDecimal num1 = guess.add(new BigDecimal("3.0"));
            for (int i = 1; i <= a; i++) {
                deci = deci.multiply(num1);
            }

            // Calculating two digits before the decimal point
            StringBuffer str1 = new StringBuffer(deci.toPlainString());
            int index = 0;
            while (str1.charAt(index) != '.') {
                index++;
            }
            // Printing output
            //System.out.print(jj + " ");
            System.out.print(str1.charAt(index - 3));
            System.out.print(str1.charAt(index - 2));
            System.out.println(str1.charAt(index - 1));
        }

    }

}
