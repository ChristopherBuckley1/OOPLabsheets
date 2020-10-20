package Lab5.exercise3;

public class Thermometer {
    private int curTemp;
    private int maxTemp;
    private int minTemp;

    public Thermometer(){
        this(0,Integer.MIN_VALUE,Integer.MAX_VALUE);
    } //<<<no argument constructor
// V single argument constructor V
    public Thermometer(int curTemp,int minTemp,int maxTemp){
      setCurTemp(curTemp);
      setMinTemp(minTemp);
      setMaxTemp(maxTemp);

//accessors
    }
    public int getCurTemp(){
        return curTemp;
    }
    public int getMinTemp(){
        return minTemp;
    }
    public int getMaxTemp(){
        return maxTemp;
    }
  //Mutators
    public void setCurTemp(int curTemp){
        this.curTemp=curTemp;
    }

    public void setMinTemp(int minTemp){
        this.minTemp=minTemp;
    }
    public void setMaxTemp(int maxTemp){
        this.maxTemp = maxTemp;
    }
    //toString
    public String toString(){
        return "Current temperature: "+getCurTemp()+"\nMinimum temperature: "+getMinTemp()+"\nMaximum temperature: "+getMaxTemp();
    }

    public void setTemperature(int curTemp){
        setCurTemp(curTemp);
        updateMinMaxTemp(curTemp);


    }
    private void updateMinMaxTemp(int curTemp){
        if(maxTemp == Integer.MAX_VALUE)
        {
            maxTemp = curTemp;
        }
        else if(curTemp>maxTemp)
        {
            maxTemp = curTemp;
        }
        if(minTemp == Integer.MIN_VALUE)
        {
            minTemp = curTemp;
        }
        else if(minTemp > curTemp)
        {
            minTemp = curTemp;
        }

    }


}
