package Lab4.exercise4;

public class Book {
    private String title;
    private float price;
    private String IBSN;
    private int pages;


    public Book(){
       this("No Valid Title Supplied",0,"IBSN Not available",0);
    }

    public Book(String title, float price, String IBSN, int pages){
        setTitle(title);
        setPrice(price);
        setIBSN(IBSN);
        setPages(pages);

    }

    String getTitle(){
        return title;
    }
    public float getPrice(){
        return price;
    }
    public String getIBSN(){
        return IBSN;
    }
    public int getPages(){
        return pages;
    }


    public void setTitle(String title){
        if(title.equals(""))
        this.title = "No valid title supplied";
        else
            this.title=title;
    }
    public void setPrice(float price){
        if(price < 0 || price > 50000.00)
            this.price = 0;
        else
            this.price = price;
    }
    public void setIBSN(String IBSN) {
        if(IBSN.equals(""))
            this.IBSN = "No valid IBSN supplied";
        else
        this.IBSN = IBSN;
    }
    public void setPages(int pages) {
        if(pages<0||pages > 4000)
            this.pages = 0;
        else
            this.pages= pages;
    }





    public String toString(){
        return "title: "+getTitle()+" price: " +getPrice() + "IBSN: "+getIBSN() + " pages:"+getPages();
    }
}
