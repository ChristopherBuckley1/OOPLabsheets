package Lab6.exercise1;

import javax.swing.*;

public class personDriver {
    public static void main(String[] args) {
        String output="";
        person p1 = new person();
        output += "Person Class Tester \n\n\nCalling the Person() constructor....\nValue of the person object is"+
        ": "+ p1.toString();
        String firstName = JOptionPane.showInputDialog("Please enter the first name of the second person");
        String lastName = JOptionPane.showInputDialog("Please enter the last name of the second person");

        person p2 = new person(firstName,lastName);

        output += "\n\n\n\nCalling the Person(String,String) constructer after getting user supplied values .....\n"+
                "The value of the person object is: "+p2.toString();

        JOptionPane.showMessageDialog(null,output,"Person Class Tester",JOptionPane.INFORMATION_MESSAGE);

    }

}
