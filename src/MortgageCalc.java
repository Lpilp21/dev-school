import java.util.Scanner;

public class MortgageCalc {
    double principal;
    double yearlyRate;
    int numberOfYears;
    double calculateMortgage(){
        Scanner scanner = new Scanner(System.in);
        principal = getPrincipal(scanner);
        yearlyRate = getYearlyRate(scanner);
        numberOfYears = getNumberOfYears(scanner);
        int numMonths =  numberOfYears*12;
        double monthlyRate = yearlyRate / (12 * 100);
        //M = p*(r(1+r)^n/((1+r)^n-1))
        return principal*(monthlyRate*Math.pow(1+monthlyRate, numMonths))/(Math.pow(1+monthlyRate, numMonths) -1);

    }
    double getPrincipal(Scanner scanner){
        System.out.println("Enter your principal[1k-1m]: ");
        principal = scanner.nextDouble();
        while(principal<1000 || principal > 1000000){
            System.out.println("Enter valid value [1k-1m]: ");
            principal = scanner.nextDouble();
        }
        return principal;
    }
    double getYearlyRate(Scanner scanner){
        System.out.println("Enter yearly rate(0,100): ");
        yearlyRate = scanner.nextDouble();
        while(yearlyRate<=0 || yearlyRate>=100){
            System.out.println("Enter valid value (0,100): ");
            yearlyRate = scanner.nextDouble();
        }
        return yearlyRate;

    }
    int getNumberOfYears(Scanner scanner){
        System.out.println("Enter number of years(0, 100): ");
        numberOfYears = scanner.nextInt();
        while(numberOfYears<=0 || numberOfYears>=100){
            System.out.println("Enter valid value (0,100): ");
            yearlyRate = scanner.nextInt();
        }
        return numberOfYears;
    }
}
