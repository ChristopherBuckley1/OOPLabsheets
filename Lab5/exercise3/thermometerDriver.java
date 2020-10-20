package Lab5.exercise3;
import javax.swing.*;


public class thermometerDriver {
    public static void main(String[] args) {
        int curTemp = 35,minTemp = 35,maxTemp = 35;
        Thermometer t1 = new Thermometer(curTemp,minTemp,maxTemp);
        String output = "";

        output += "****Thermometer Testing****\n\n\nCalling the single-argument constructor.... "+
                "setting the temperature of the first thermometer to 35C\nFirst Thermometer\n"+t1.toString()+"\n\n\n";

        System.out.println(output);

       Thermometer t2 = new Thermometer();

        output += "Calling the no-argument constructor....setting the temperature of the second thermometer to 0C"+
                "\nSecond thermometer\n"+t2.toString()+"\n\n";
        System.out.println(output);

        curTemp = 25;


        t2.setTemperature(curTemp);

        output += "Calling setTemperature()....setting the thermometer to 25C\nSecond Thermometer:\n"+t2.toString();

        JOptionPane.showMessageDialog(null,output,"Test",JOptionPane.INFORMATION_MESSAGE);

        curTemp = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer: "));

        t1.setTemperature(curTemp);

        output = "";

        output += "****Thermometer Testing****\n\n\nCalling setTemperature().... "+
                "setting the temperature of the first thermometer to"+curTemp+"\nFirst Thermometer\n"+t1.toString()+"\n\n\n";

        JOptionPane.showMessageDialog(null,output,"Test",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);


    }
}
