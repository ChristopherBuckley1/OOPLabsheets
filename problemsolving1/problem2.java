package problemsolving1;

import javax.swing.*;

public class problem2 {
    public static void main(String[] args) {
        String condition = "", grade;
        double minimumDiameter, maximumDiameter, averageDiameter;

        String banner = "----- the super duper potato grading machine\n\n\n";

        condition = JOptionPane.showInputDialog(banner + "please enter the condition of the potato (good or bad)");

        if (condition.equalsIgnoreCase("good")) {
            minimumDiameter = Double.parseDouble(JOptionPane.showInputDialog(banner + "Please enter the minimum diameter of the potato"));

            if (minimumDiameter > 0) {
                maximumDiameter = Double.parseDouble(JOptionPane.showInputDialog(banner + "Please enter the maximum diameter of the potato"));

                if (maximumDiameter > 0) {
                    averageDiameter = (maximumDiameter + minimumDiameter) / 2;

                    if (averageDiameter < 25)
                        grade = "D";
                    else if (averageDiameter < 50)
                        grade = "C";
                    else if (averageDiameter < 75)
                        grade = "B";
                    else
                        grade = "A";

                    JOptionPane.showMessageDialog(null, "The average diameter of the potato is " +
                            averageDiameter + "mm and so its grade is " + grade, "Potato information", JOptionPane.INFORMATION_MESSAGE);

                } else
                    JOptionPane.showMessageDialog(null, "The maximum diameter value cannot be negative . . . . exiting program now"
                            , "Invalid information", JOptionPane.ERROR_MESSAGE);
            } else
                JOptionPane.showMessageDialog(null, "The minimum diameter value cannot be negative . . . . exiting program now"
                        , "Invalid information", JOptionPane.ERROR_MESSAGE);
        } else if (condition.equalsIgnoreCase("bad")) {
            JOptionPane.showMessageDialog(null, "The condition of this potato is bad .... exiting program now"
                    , "Bad Potato", JOptionPane.WARNING_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "You have entered an invalid potato condition .... exiting program now"
                    , "Invalid Information",JOptionPane.ERROR_MESSAGE);

        System.exit(0);
    }
}
