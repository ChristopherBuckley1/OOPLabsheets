package problemsolving3;
import javax.swing.JOptionPane;

public class testDate {
    public static void main(String[] args) {
        int day,month,year;
        String output="";

        Date date1 = new Date();
        output += "Just called the Date() constructor - value of first Date object is " + date1;

        day = Integer.parseInt(JOptionPane.showInputDialog("Please enter a day value"));
        month = Integer.parseInt(JOptionPane.showInputDialog("Please enter a month value"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Please enter a year value"));

        Date date2 = new Date(day,month,year);
        output += "\n\nJust called the Date(int,int,int) constructor - value of second Date object is " + date2;

        output += "\n\nJust called the equals() method to check whether the Date objects \nhold the same values. The result" +
                " is that the dates are ";

        if(date1.equals(date2))
            output += "the same";
        else
            output += "different";

        Date date3 = date2.copy();

        output += "\n\nJust called the copy() method to make a copy of the 2nd Date object\n and store it in a 3rd Date object. " +
                " The value of the 3rd Date object is " + date3;
        JOptionPane.showMessageDialog(null,"The Results of Testing the Date Class are as follows:\n\n" + output,
                "Date Class Test Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
