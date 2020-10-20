package Lab5.exercise5;

public class bankAccountDriver {
    public static void main(String[] args) {
        String output;
        BankAccount b1 = new BankAccount();
        output = "Calling the no-argument BankAccount constructor. The first BankAccount details are:\n\n"+b1.toString()+"\n";

        String owner = "Richy Rich";
        int number = 2342343;
        double intRate = 0.75;

        BankAccount b2 = new BankAccount(owner,number,intRate);
        output += "\n\nCalling the multi-argument BankAccount constructor. The second BankAccount details are:\n\n"+b2.toString()+"\n\n";

        intRate = 0.5;
        b1.setIntRate(intRate);
        output += "\nNow calling the setInterestRate() method to change the interest rate to 0.5\n"+"\nThe first BankAccount details are: \n"+b1.toString()+
                "\n\nThe second BankAccount details are:\n\n"+b2.toString()+"\n";;

        System.out.println(output);
    }
}
