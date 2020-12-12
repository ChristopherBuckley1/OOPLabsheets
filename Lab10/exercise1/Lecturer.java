package Lab10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer(String name,String address,GregorianCalendar dateOfBirth,String staffID,String[] coursesTaught,GregorianCalendar dateOfAppointment)
    {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(staffID);
        setCoursesTaught(coursesTaught);
        setDateOfAppointment(dateOfAppointment);
    }


    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public String toString(){

        String text ="";
        text+="Lecturer name is: "+getName()+
                "\nLecturer Address is: "+getAddress()+
                "\nLecturer Date of Birth is ";


        if(getDateOfBirth()!=null)
        {
            //Need to get the date of birth as a Date for display purposes.
            //The toString() method from the GregorianCalendar class inherits
            //that from its superclass Calendar but this only displays the
            //calendar data in a non-friendly format like the default
            //toString() from the Object class

            Date dob = getDateOfBirth().getTime();

            //Need to use get the date of birth out on screen in a particular
            //way i.e. DD-MM-YYYY format. The SimpleDateFormat class in
            //java.text does the job. Interestingly, "MM" has to be in capitals
            //or else you would be displaying milliseconds rather than month

            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            String strDob = formatDate.format(dob);
            text+=strDob;

        }
        else
            text+="Undefined";


                text += "\nLecturer StaffID is "+getStaffID();



        text +="\nLecturer Courses Taught are: ";
        for(int i= 0;i<getCoursesTaught().length;i++)
        {

            text+=getCoursesTaught()[i]+" ";

        }
        text += "\nLecturer date of Appointment is ";

        if(getDateOfAppointment()!=null)
        {
            //Need to get the date of birth as a Date for display purposes.
            //The toString() method from the GregorianCalendar class inherits
            //that from its superclass Calendar but this only displays the
            //calendar data in a non-friendly format like the default
            //toString() from the Object class

            Date doa = getDateOfAppointment().getTime();

            //Need to use get the date of birth out on screen in a particular
            //way i.e. DD-MM-YYYY format. The SimpleDateFormat class in
            //java.text does the job. Interestingly, "MM" has to be in capitals
            //or else you would be displaying milliseconds rather than month

            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            String strDoa = formatDate.format(doa);
            text+= strDoa;

        }
        else
            text+="Undefined";

        text +=
                "\nLecturer Status is "+getStatus()+
                "\nLecturer point on scale is "+getPointOnScale();


        return text;
    }

    public abstract String getStatus();

    public abstract int getPointOnScale();
}
