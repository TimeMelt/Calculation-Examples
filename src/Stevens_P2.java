class SavingsAccount {
    static double annualInterestRate = 0.04;
    private double savingsBalance;


    public static void main(String[] args) {

        double savings1 = 2000.00;
        double savings2 = 3000.00;
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.savingsBalance = 2000.00;
        saver2.savingsBalance = 3000.00;

        double s1 = saver1.savingsBalance;
        double s2 =  saver2.savingsBalance;

        calculateMonthlyInterest(s1, s2);

    }

    public static void calculateMonthlyInterest(double s1, double s2) {

        double rate1 = (s1 * annualInterestRate) / 12;
        double rate2 = (s2 * annualInterestRate) / 12;
        double new1 = (rate1 * 12) + s1;
        double new2 = (rate2 * 12) + s2;
        s1 = new1;
        s2 = new2;

        System.out.println("Interest rate for saver1 is " + rate1 + "per month.");
        System.out.println("Interest rate for saver2 is " + rate2 + "per month.");
        System.out.println("New savings balance for saver1 is " + new1);
        System.out.println("New savings balance for saver2 is " + new2);

        modifyInterestRate(s1, s2);

    }

    public static void modifyInterestRate(double s1, double s2) {
        annualInterestRate = 0.05;

        double rate1 = (s1 * annualInterestRate) / 12;
        double rate2 = (s2 * annualInterestRate) / 12;
        double new1 = rate1 + s1;
        double new2 = rate2 + s2;

        System.out.println("Modified interest rate for saver1 is " + rate1 + "per month.");
        System.out.println("Modified interest rate for saver2 is " + rate2 + "per month.");
        System.out.println("New savings balance for saver1 is " + new1);
        System.out.println("New savings balance for saver2 is " + new2);


    }

}
