package credit;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;


class CreditCalculatorTest {

    @Test
    void monthPaymentCalc() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        CreditCalculator calculator = new CreditCalculator();
        int sum = 100_000;
        int percent = 13;
        int months = 24;
        double monthPercent = Double.parseDouble(decimalFormat.format(months / percent));
        double monthPay = Double.parseDouble(decimalFormat.format(sum * monthPercent / 100));
        double res = Double.parseDouble(decimalFormat.format(monthPay + (sum / months)));
        assertTrue(res == calculator.monthPaymentCalc(sum, percent, months));
    }

    @Test
    void totalAmount() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        CreditCalculator calculator = new CreditCalculator();
        int sum = 100_000;
        int percent = 13;
        int months = 24;
        double monthPercent = Double.parseDouble(decimalFormat.format(months / percent));
        double res = Double.parseDouble(decimalFormat.format(monthPercent + sum));
        assertTrue(res == calculator.totalAmount(sum, percent, months));
    }

    @Test
    void allOverpayments() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        CreditCalculator calculator = new CreditCalculator();
        int sum = 100_000;
        int percent = 13;
        int months = 24;
        double monthPercent = Double.parseDouble(decimalFormat.format(months / percent));
        double allPay = Double.parseDouble(decimalFormat.format(monthPercent + sum));
        double res = Double.parseDouble(decimalFormat.format(allPay - sum));
        assertTrue(res == calculator.allOverpayments(sum, percent, months));
    }
}