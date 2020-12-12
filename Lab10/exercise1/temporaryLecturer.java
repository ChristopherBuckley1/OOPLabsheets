package Lab10.exercise1;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class temporaryLecturer extends Lecturer {
    private int hoursWorked;



    public temporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[]
            coursesTaught, GregorianCalendar dateOfAppointment, int hoursWorked){
        super(name,address,dateOfBirth,staffID,coursesTaught,dateOfAppointment);
        setHoursWorked(hoursWorked);
    }

    public String getStatus() {
        return "Contracted temporary lecturer on part-time hours";
    }

    public int getPointOnScale() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Ireland"));
        cal.setTime(date);
        int currentYear = cal.get(Calendar.YEAR);
        int doa = getDateOfAppointment().get(Calendar.YEAR);

        double num=0;
        if(currentYear-doa>=3&&getHoursWorked()>1500)
            return 4;
        else if(currentYear-doa>=3&&getHoursWorked()>1000)
             num=(700/(getHoursWorked()*1.33))+1;

        else num=(currentYear-doa);

        return (int)num;

    }
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public String toString(){
        String str="";
        str += super.toString();
        str += "\nHours worked: "+getHoursWorked();
        return str;
    }
}
