package chapter3;

public class DietelExercise317 {
    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double heightInInches;
    private double weightInPounds;
    private double bmi ;
    private int maximumHeartRate;
    private String targetHeartRate;
    private double heartRate;
    private int age;

    public DietelExercise317(String firstName,String lastName,String gender,int dayOfBirth,int monthOfBirth,int yearOfBirth,double heightInInches,double weightInPounds){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth =dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
        //this.maximumHeartRate = 220 - yearOfBirth;
       // this.targetHeartRate = targetHeartRate;
    }

        public void setBmi(double weightInPounds, double heightInInches){
            this.bmi = weightInPounds / heightInInches * heightInInches;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public void setLastName(String lastName){
        this.lastName = lastName;
        }
        public void setGender (String gender){
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

        public void setDayOfBirth(int dayOfBirth){
        this.dayOfBirth = dayOfBirth;
        }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public double getBmi() {
            return this.bmi;


        }
        public void setMaximumHeartRate( int age){
        this.maximumHeartRate = 220 - this.age;

        }
        public int getMaximumHeartRate() {
                return this.maximumHeartRate;
            }

        public void setAge(int yearOfBirth){
            this.age = 2023 - yearOfBirth;

        }
            public int getAge() {
            return age;
            }
        public void setTargetHeartRate(int maximumHeartRate){
            double start = ((double) 50 / 100) * getMaximumHeartRate();
            double end = ((double) 85 / 100) * getMaximumHeartRate();
            String range;
            range = start + " - " + end + "%";
            this.targetHeartRate = range;
        }
        public String getTargetHeartRate(){
        return targetHeartRate;
        }







}
