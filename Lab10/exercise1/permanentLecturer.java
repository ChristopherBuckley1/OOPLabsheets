package Lab10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class permanentLecturer extends Lecturer {
    private String pensionEntitlements;
    private String status;

    public permanentLecturer(String name, String address, GregorianCalendar dateOfBirth,String staffID,String[] coursesTaught,GregorianCalendar dateOfAppointment,String pensionEntitlements, String status)
    {
        super(name,address,dateOfBirth,staffID,coursesTaught,dateOfAppointment);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }


    public String getStatus() {
        return status;
    }


    public int getPointOnScale()  {

       Date date = new Date();
       Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Ireland"));
       cal.setTime(date);
       int currentYear = cal.get(Calendar.YEAR);
       int doa = getDateOfAppointment().get(Calendar.YEAR);


        if(currentYear-doa>=20)
        return 20;
        else
            return currentYear-doa;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return super.toString()+"\nLecturer Pension entitlements: " + getPensionEntitlements()+"\n";
    }
}
