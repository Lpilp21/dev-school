import java.text.NumberFormat;

public class Mortgage{
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    int principal;
    float annualInterest;
    byte years;
    float monthlyInterest;
    float numberOfPayments;
    double mortgage;
    Balance myBalance;
    public Mortgage(int principal, float annualInterest, byte years){
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
        monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        numberOfPayments = years * MONTHS_IN_YEAR;
        setMortgage();
    }
    void createBalance(){
        myBalance = new Balance(principal, annualInterest, years);
    }

    public void setMortgage(){
        mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
    public void printMortgage() {
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
    public Balance getBalanceObj(){

        return myBalance;
    }
    public void makePayment(double amount){
        myBalance.balance = myBalance.balance+amount;
        myBalance.numberOfPaymentsMade++;

    }


}
