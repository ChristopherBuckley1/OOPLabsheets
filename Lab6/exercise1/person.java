package Lab6.exercise1;

public class person {
    private String firstName;
    private String lastName;

    public person(){this("Not Supplied","Not Supplied");}
    public person(String firstName,String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);
    }
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public void setName(String firstName, String lastName){this.firstName=firstName;
                                                            this.lastName=lastName;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public String toString()
    {
        return "First Name: "+getFirstName()+" Last Name: "+getLastName();
    }
}
