package Lab11.exercise2;

//TestArrayList.java
/*A driver (test) class that contains the main() method for
testing the functionality of the LineItem and Product classes but this time
an array-list is used for maintaining a collection of LineItem objects and
a separate collection of Product objects. The driver is also testing out
the functionality of the ArrayList class*/

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {

        // Create Products
        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen", "This is a black pen");
        Product p12 = new Product(12, "Blue Pen", "This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");

//Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15));
        int choice = 0;
        String text = "";
        while (choice != 5) {
            String choiceAS = JOptionPane.showInputDialog(null, "1. Add a product\n2. Amend a product\n3. Remove a product\n4. View all products\n5.Quit");
            choice = Integer.parseInt(choiceAS);
            if (choice == 5) {
                JOptionPane.showMessageDialog(null, "Thanks for using the system!", "Farewell!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            if (choice == 4) {
                for (Product p : allProducts) {

                    text += p + "\n";
                }
                JOptionPane.showMessageDialog(null, text, "List of All Products", JOptionPane.INFORMATION_MESSAGE);
            }
            if (choice == 3) {
                String text2 = "";

                String searchquery = JOptionPane.showInputDialog("Please enter the name of the product you wish to delete");
                text2 += "The following products matched your search phrase\n\n";
                for (Product p : allProducts) {


                    if (p.toString().contains(searchquery)) {
                        text2 += p.toString() + "\n";
                        System.out.println(text2);
                    }

                }
                text2 += "\n\n\nPlease enter the id of the one you want to remove";
                String delChoiceAS = JOptionPane.showInputDialog(text2);
                int delChoice = Integer.parseInt(delChoiceAS);
                Iterator<Product> iterator = allProducts.iterator();
                while (iterator.hasNext()) {
                    Product p = iterator.next();
                    if (p != null && p.getId() == delChoice) {
                        int delConfirm = JOptionPane.showConfirmDialog(null, "The details of the product you wish to amend are: \n\n" + p +
                                "\n\nAre you sure you want to delete it?");
                        if (delConfirm == JOptionPane.YES_OPTION) {
                            iterator.remove();
                            JOptionPane.showMessageDialog(null, "Product now removed from list", "Product Removed", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Product removal cancelled", "Product not removed", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }


            }
            if (choice == 2) {
                String text2 = "";

                String searchquery = JOptionPane.showInputDialog("Please enter the name of the product you wish to Amend");
                text2 += "The following products matched your search phrase\n\n";
                for (Product p : allProducts) {


                    if (p.toString().contains(searchquery)) {
                        text2 += p.toString() + "\n";
                        System.out.println(text2);
                    }

                }
                text2 += "\n\n\nPlease enter the id of the one you want to Amend";
                String delChoiceAS = JOptionPane.showInputDialog(text2);
                int delChoice = Integer.parseInt(delChoiceAS);

                for (Product p : allProducts) {
                    if (p != null && p.getId() == delChoice)
                    {
                        String delConfirm = JOptionPane.showInputDialog( "The details of the product you wish to amend are: \n\n" + p +
                                "\n\n1. Amend Name\n2. Amend Description\n3.Cancel Amendment");
                        if (delConfirm.equals("1"))
                        {

                            String name = JOptionPane.showInputDialog( "Enter a name");
                            p.setName(name);
                            JOptionPane.showMessageDialog(null, "Product Details Now Amended!", "Product Amended", JOptionPane.INFORMATION_MESSAGE);
                            System.out.print(p);
                        }
                        else if (delConfirm.equals("2"))
                        {

                            String Description = JOptionPane.showInputDialog( "Enter a description");
                            p.setDescription(Description);
                            JOptionPane.showMessageDialog(null, "Product Details Now Amended!", "Product Amended", JOptionPane.INFORMATION_MESSAGE);
                            System.out.print(p);
                        }
                        else if(delConfirm.equals("3"))
                            {
                                JOptionPane.showMessageDialog(null, "Product amendment cancelled", "Product not Amended", JOptionPane.INFORMATION_MESSAGE);
                            }
                    }
                }
            }
            if(choice == 1)
            {
                String pidAS = JOptionPane.showInputDialog("Please enter a product ID");
                String name = JOptionPane.showInputDialog("Please enter a product name");
                String desc = JOptionPane.showInputDialog("Please enter a product Description");
                int pid = Integer.parseInt(pidAS);

                Iterator<Product> iterator = allProducts.iterator();
                while (iterator.hasNext())
                {
                   Product p = new Product(pid,name,desc);
                    allProducts.add(p);
                    System.out.println(p);
                    break;
                }

            }
            System.out.println(allProducts.toString());
        }

    }

}


