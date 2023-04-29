public class Main {
    public static void main(String[] args) {
        int principal = (int) Utils.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Utils.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Utils.readNumber("Period (Years): ", 1, 30);
        Mortgage myMortgage = new Mortgage(principal, annualInterest, years);
        myMortgage.printMortgage();
        myMortgage.createBalance();
        myMortgage.getBalanceObj().printPaymentSchedule();
        myMortgage.makePayment(10000);
        System.out.println(myMortgage.getBalanceObj().getBalance());
    }

}