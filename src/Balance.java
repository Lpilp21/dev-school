import java.text.NumberFormat;

public class Balance extends Mortgage{
    short numberOfPaymentsMade;
    double balance;
    public Balance(int principal, float annualInterest, byte years) {
        super(principal, annualInterest, years);
        this.numberOfPaymentsMade = 0;
        this.balance = -mortgage;
    }
    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years*MONTHS_IN_YEAR; month++) {
            System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));
        }
    }

    public double getBalance() {
        return balance;
    }

    public short getNumberOfPaymentsMade() {
        return numberOfPaymentsMade;
    }
}
