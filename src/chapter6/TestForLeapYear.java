package chapter6;

public class TestForLeapYear {

    private int year;
    String yearType="";
    public TestForLeapYear(int year){
        if(year %4 == 0 && year%100 !=0){
            yearType = "leap year";
        }else if (year%100 ==0 && year %400 ==0) {
            yearType = "Leap year";

        }else{ yearType = "Not leap year";}
        this.year = year;
    }
    public void setYear(int year) {
        if(year %4 == 0 && year%100 !=0){
            yearType = "Leap year";
        } else if (year%100 ==0 && year %400 ==0) {
            yearType = "Leap year";

        }else{ yearType = "Not leap year";}
        this.year = year;
    }
    public String getYearType() {
        return yearType;
    }

    public static void main(String[] args) {
        TestForLeapYear leapYear = new TestForLeapYear(2016);
        System.out.println(leapYear.getYearType());

    }


}
