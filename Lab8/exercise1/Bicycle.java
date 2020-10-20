package Lab8.exercise1;

    public class Bicycle extends Vehicle {
        private int gearCount;
        private boolean hasBell;


        public Bicycle(){
            setGearCount(0);
            setHasBell(false);
        }
        public Bicycle(double price,double length,double height,double weight,String manufacturer,String model,int gearCount,boolean hasBell)
        {
            super(price,length,height,weight,manufacturer,model);
            setGearCount(gearCount);
            setHasBell(false);
        }
        public int getGearCount(){
            return gearCount;
        }
        public void setGearCount(int gearCount)
        {
            this.gearCount=gearCount;
        }
        public boolean getHasBell(){
            return hasBell;
        }
        public void setHasBell(Boolean hasBell){
            this.hasBell = hasBell;
        }

        public String toString(){
             String str = super.toString() + "  Gear count: " + getGearCount() + "  Has bell: ";
            if(getHasBell()==false)
                str+="No";
            else
                str+= "Yes";
            return str;
        }
    }


