package chapter3;

public class DietelExercise316 {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String targetHeartRate;
    private int age;
    private double maximumHeartRate;
    public DietelExercise316(String firstName,String lastName,int dayOfBirth,int monthOfBirth,int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth =dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;


    }
    public void setFirstName(String firstName){
    this.firstName = firstName;
    }
    public String getFirstName(){
    return firstName;
    }
    public void setLastName(String lastName){
    this.lastName = lastName;
    }
    public String getLastName(){
    return lastName;
    }

    public void setDayOfBirth(int dayOfBirth){
        this.dayOfBirth = dayOfBirth;
    }
    public int getDayOfBirth(){
        return dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth)
    {
        this.monthOfBirth = monthOfBirth;
    }
    public int getMonthOfBirth (){
        return monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setMaximumHeartRate(int age){
        this.maximumHeartRate = 220 -this.age;
    }
    public double maximumHeartRate(){

        return maximumHeartRate;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int yearOfBirth){
        this.age = 2023 - this.yearOfBirth;
    }
    public void setTargetHeartRate(String maximumHeartRate){
        double start = ((double) 50 / 100) * maximumHeartRate();
       double end = ((double) 85 / 100) * maximumHeartRate();
       String range = start + " - " + end + "%";
        this.targetHeartRate = range;
    }
        public String getTargetHeartRate(){
        return targetHeartRate;
        }

}










