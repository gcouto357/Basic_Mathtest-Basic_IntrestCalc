public class Application {
    public static void main(String[] args) {
        //variable dec
        int i=1,j=1;
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        //.04 interest
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Saver 1 at .04 after 1 year");
        for(i=1 ; i<=12 ; i++) {
            saver1.calculateMonthlyInterest();
        }
        System.out.println("Bal:  " + String.format("%.2f",saver1.actBalance()));
        System.out.println();

        System.out.println("Saver 2 at .04 after 1 year");
        for(j=1 ; j<=12 ; j++) {
            saver2.calculateMonthlyInterest();
        }
        System.out.println("Bal:  " + String.format("%.2f",saver2.actBalance()));
        System.out.println();

        //.05 interest
        SavingsAccount.modifyInterestRate(0.05);

        System.out.println("Saver 1 at .05 after 1 year");
        saver1.calculateMonthlyInterest();
        System.out.println("Bal: " + String.format("%.2f",saver1.actBalance()));
        System.out.println();

        System.out.println("Saver 2 at .05 after 1 year");
        saver2.calculateMonthlyInterest();
        System.out.println("Bal: " + String.format("%.2f",saver2.actBalance()));
        System.out.println();
    }

}
