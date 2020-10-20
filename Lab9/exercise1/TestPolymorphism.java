package Lab9.exercise1;

//TestPolymorphism.java
/*A driver class to test out the Employee, Boss and HourlyWorker classes*/

import Lab7.exercise2.Student;

public class TestPolymorphism {
    public static void main(String args[])
    {   Employee employees[] = new Employee[3];



        Employee employeeRef; //a reference to the Employee superclass

        Boss b1 = new Boss("Joe","Smith",750.50);
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);
        SelfEmployedWorker sw1 = new SelfEmployedWorker("Chris","Buckley",0);

        employeeRef=b1; //recall a Boss "is a" Employee so this assignment is allowed
        employees[0] = employeeRef;


        //will now use the Employee reference object to display the correct information via polymorphism

        System.out.println(employeeRef.toString() + " and the earnings were €" + String.format("%.2f",employeeRef.earnings()));

        employeeRef=hw1; //recall that an HourlyWorker "is a" Employee so this is okay too
        employees[1] = hw1;

        //will now use the Employee reference object to display the correct information via polymorphism

        //note the generic nature of the code here



        System.out.println("\n" + employeeRef.toString() + " and the earnings were €" + String.format("%.2f",employeeRef.earnings()));
        employeeRef = sw1;
        employees[2] = employeeRef;
        System.out.println("\n"+employeeRef.toString() +" amd his earnings were: €" + String.format("%.2f",employeeRef.earnings()));

        for(int i = 0;i< employees.length;i++)
        {
            System.out.println(employees[i].toString()+" and the earnings were: €"+String.format("%.2f",employees[i].earnings()));
        }
    }
}