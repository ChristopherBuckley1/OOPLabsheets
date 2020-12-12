package Lab7.caPractice;

import Lab7.exercise2.Department;
import Lab7.exercise2.Institute;
import Lab7.exercise2.Student;

public class collegetestapp{
    public static void main(String[] args) {

        Lab7.exercise2.Student student1 = new Lab7.exercise2.Student(154345,"Jake","Computing");
        Lab7.exercise2.Student student2 = new Lab7.exercise2.Student(234532,"Mary","Creative media");
        Lab7.exercise2.Student student3 = new Lab7.exercise2.Student(453726,"Tommy","Computing");
        Lab7.exercise2.Student student4 = new Lab7.exercise2.Student(623456,"Peter","Creative media");

        Lab7.exercise2.Student computingStudents[] = new Lab7.exercise2.Student[10];
        computingStudents[0] = student1;
        computingStudents[1] = student3;

        Lab7.exercise2.Student mediaStudents[] = new Lab7.exercise2.Student[10];
        mediaStudents[0] = student2;
        mediaStudents[1] = student4;

        Lab7.exercise2.Department computing = new Lab7.exercise2.Department("Computing",computingStudents);
        Lab7.exercise2.Department media = new Lab7.exercise2.Department("Creative Media",mediaStudents);

        Lab7.exercise2.Department departments[] = new Department[5];
        departments[0] = computing;
        departments[1] = media;

        Lab7.exercise2.Institute itTralee = new Institute("Intstitute of technology Tralee",departments);

        System.out.println(itTralee.toString());

        System.out.println("Total students in the institute: " + itTralee.getTotalStudents());

        System.out.println("\nMoving Jake to Creative Media department!");

        int mediaIndex = -1, compIndex = -1;
        Student[] studentSearch;

        for(int i =0;i<departments.length;i++)
            if(departments[i]!=null)
            {
                if(departments[i].getName().equalsIgnoreCase("computing"))
                    compIndex = i;
                if(departments[i].getName().equalsIgnoreCase("creative Media"))
                    mediaIndex=i;
            }
        if(compIndex != -1 && mediaIndex!=-1) {
            studentSearch = departments[compIndex].getStudents();
            for (int j = 0; j < studentSearch.length; j++) {
                if (studentSearch[j] != null) {
                    if (studentSearch[j].getId() == 154345) {
                        System.out.println("\n\nJake found!");
                        studentSearch[j].setDepartment("Creative Media");
                        departments[mediaIndex].getStudents()[2] = studentSearch[j];
                        studentSearch[j] = null;
                        break;
                    }
                    else System.out.println("\n\nJake not found!");


                }

            }
        }
        System.out.println("\n\n"+itTralee.toString());

    }
}
