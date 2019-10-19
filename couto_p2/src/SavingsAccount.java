public class SavingsAccount {
    public static double annualInterestRate = 0.0;
    private double savingsBalance;

    public void calculateMonthlyInterest(){
        savingsBalance = savingsBalance + (savingsBalance * 1 * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double interest){
        annualInterestRate = interest;
    }

    public SavingsAccount(double bal){
        savingsBalance = bal;
    }

    public double actBalance(){
        return savingsBalance;
    }




}
