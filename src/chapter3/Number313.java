package chapter3;

public class Number313 {
    private String model;
    private String year;
    private double price;

    public Number313(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void setModel(String model){
            this.model = model;
        }
     public void setYear(String year) {
         this.year = year;
     }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel(){
        return model;
    }

    public String getYear(){
        return year;
    }

    public double getPrice(){
        return price;
    }















}