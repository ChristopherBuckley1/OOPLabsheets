package problemsolving1;

import javax.swing.*;

public class problem1 {
    public static void main(String[] args) {
        int a,b,c,determinant;
        String rootTypesValues = "",x,y;
        double root1, root2;

        String banner = "*****Calculating the values and types of a quadratic equation*****" +
                        "\n\n\nThe quadratic equation has the form ax^2 + bx + c = 0\n\n\n";

        a = Integer.parseInt(JOptionPane.showInputDialog(banner + "Please enter a value for integer co-efficient a"));
        b = Integer.parseInt(JOptionPane.showInputDialog(banner + "Please enter a value for integer co-efficient b"));
        c = Integer.parseInt(JOptionPane.showInputDialog(banner + "Please enter a value for integer co-efficient c"));

        determinant = b*b - 4*a*c;

        if(determinant>0){

            root1 = (-1*b + Math.sqrt(determinant))/(2*a);
            root2 = (-1*b - Math.sqrt(determinant))/(2*a);
            rootTypesValues = "2 distinct real roots and their values are " + String.format("%.3f",root1)+
                                "and "+String.format("%.3f", root2);
        }
        else if(determinant == 0){
            root1=(-1*b+Math.sqrt(determinant))/(2*a);
            root2=root1;
            rootTypesValues = "2 identical real roots and their values are "+String.format("%.3f",root1)+
                    " and "+String.format("%.3f",root2);
        }
        else{
            x = String.format("%.3f", -1f*b/(2*a));
            y = String.format("%.3f",Math.sqrt(-1*determinant)/(2*a));
            rootTypesValues = "2 complex conjugate roots and their values are " + x + "+i" + y + " and " +
                    x + "-i" +y;
        }
        JOptionPane.showMessageDialog(null,"the quadratic equation has " + rootTypesValues,"roots and types",JOptionPane.INFORMATION_MESSAGE);


    }

}
