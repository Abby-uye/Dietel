package tdd;

public class AirCondition {
    private boolean isOn;
    private int temperature = 16;

    public void toggle (){
        isOn = !isOn;
    }
    public boolean isOn(){
        return isOn;
    }
        public void increaseTemperature(){
            if (isOn && temperature < 30){
                temperature++;
            } else if(isOn && temperature >= 30){
                temperature = 30;
            }
        }
        public int checkTemperature() {
            return temperature;
    }


        public void decreaseTemperature() {
            if (isOn && temperature > 16) {
                temperature--;
            } else if (isOn && temperature <= 16) {
                temperature = 16;
            }

        }



        }










