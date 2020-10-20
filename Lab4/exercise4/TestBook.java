package Lab4.exercise4;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";
        String titleF= JOptionPane.showInputDialog("Please enter the title of your favorite book"),
                ISBNF = JOptionPane.showInputDialog("Please enter the ISBN of your favorite book");

        float priceF = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price of your favorite book "));

        int pagesF = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your favorite book"));


        Book b1 = new Book(titleF,priceF,ISBNF,pagesF);



        String titleLF= JOptionPane.showInputDialog("Please enter the title of your least favorite book"),
                ISBNLF = JOptionPane.showInputDialog("Please enter the ISBN of your least favorite book");

        float priceLF = Float.parseFloat(JOptionPane.showInputDialog("Please enter the price of your least favorite book "));

        int pagesLF = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages of your least favorite book"));


        Book b2 = new Book(titleLF,priceLF,ISBNLF,pagesLF);
        output += String.format("%-25s%-8s%-15s%s\n\n%-25s%-8.2f%-15s%d","Title","Price","ISBN","Pages",b2.getTitle(),
                b2.getPrice(),b2.getIBSN(),b2.getPages());

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        output += String.format("\n\n%-25s%-8.2f%-15s%d",b1.getTitle(),
                b1.getPrice(),b1.getIBSN(),b1.getPages());

        textArea.append(output);

        JOptionPane.showMessageDialog(null,textArea,"Book Info",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);




//test

    }
}
