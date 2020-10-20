package problemsolving3;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(){
        this(1,1,1900);
    }

    public Date(int day,int month,int year)
    {
        setDay(day);
        setMonth(month);
        setYear(year);

    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month)
    {
        this.month = month;
    }
    public void setYear(int year)
    {
        this.month = month;
    }
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }
    public String toString(){
        return getDay() + "-" + getMonth() + "-" + getYear();
    }

    public boolean equals(Date date){
        if(date.getDay() == getDay() && date.getMonth() == getMonth() && date.getYear() == getYear())
            return true;

        return false;
    }

    public Date copy(){
        return new Date(day,month,year);
    }
}
