package Lab5.exercise4;

public class BankAccount {
    private String owner;
    private int number;
    private static double intRate;

    public BankAccount(){this("Owner not Available",0,0);}



    public BankAccount(String owner,int number,double intRate){
       setOwner(owner);
       setNumber(number);
        setIntRate(intRate);

    }
    public String getOwner(){return owner;}
    public int getNumber(){return number;}
    public double getIntRate(){return intRate;}

    public void setOwner(String owner){

        this.owner = owner;
    }
    public void setNumber(int number){this.number = number;}
    public void setIntRate(double intRate){this.intRate = intRate;}

    public String toString()
    {
        return "Owner: "+owner+" Account Number: "+number+" Interest rate: "+intRate;
    }

}
