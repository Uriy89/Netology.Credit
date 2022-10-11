package credit;


import java.text.DecimalFormat;

public class CreditCalculator {

    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");
    public double monthPaymentCalc(int sum, int percent, int months) {
        double monthPercent = Double.parseDouble(decimalFormat.format(months / percent));
        double monthPay = Double.parseDouble(decimalFormat.format(sum * monthPercent / 100));
        double res = Double.parseDouble(decimalFormat.format(monthPay + (sum / months)));
        return res;
    }

    public double totalAmount(int sum, int percent, int months) {
        double monthPercent = Double.parseDouble(decimalFormat.format(months / percent));
        double res = Double.parseDouble(decimalFormat.format(monthPercent + sum));
        return res;
    }

    public double allOverpayments(int sum, int percent, int months) {
        double monthPercent = Double.parseDouble(decimalFormat.format(months / percent));
        double allPay = Double.parseDouble(decimalFormat.format(monthPercent + sum));
        double res = Double.parseDouble(decimalFormat.format(allPay - sum));
        return res;
    }
}
