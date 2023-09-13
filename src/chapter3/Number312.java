package chapter3;

public class Number312 {
    private String location;
    private String petrolType;
    private int quantityOfPurchase;
    private double pricePerLiter;
    private double percentageDiscount;

    public Number312(String location, String petrolType, int quantityOfPurchase, double pricePerLiter, double percentageDiscount){
        this.location = location;
        this.petrolType =petrolType;
        this.quantityOfPurchase = quantityOfPurchase;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;

    }

       public double getPurchaseAmount(){
       double purchaseAmount = quantityOfPurchase * pricePerLiter - percentageDiscount;
        return purchaseAmount;
       }
        public void setLocation(String location){
        this.location = location;
        }
        public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
        }

        public void setQuantityOfPurchase(int quantityOfPurchase){
        this.quantityOfPurchase = quantityOfPurchase;
        }

        public void setPricePerLiter(double pricePerLiter){
        this.pricePerLiter = pricePerLiter;
        }

        public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
        }

        public String getLocation(){
        return location;
        }

        public String getPetrolType(){
        return petrolType;
        }

        public int getQuantityOfPurchase(){
        return quantityOfPurchase;
        }

        public double getPricePerLiter(){
        return pricePerLiter;
        }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }














}
