package tdd;

public class Bike2 {
private boolean isOn;
private int speed =0;



public void isOn(){
    isOn = !isOn;
}
    public boolean remote(){
    return isOn;
    
    }
    public int checkSpeed(){
    return speed;
        }
    public void accelerate () {
    if (isOn && speed < 20){
        speed = speed+1;
    }else if (isOn && speed == 21 || speed <= 30){
        speed = speed+2;
        
    }else if (isOn && speed ==31 || speed <= 40){
        speed = speed+3;
                
    } else if (isOn && speed == 41 ||speed >41) {
        speed = speed+4;
        
    }
}

    public void decelerate() {
    if (isOn && speed <20 && speed >0){
        speed = speed-1;
    } else if (isOn && speed == 21 || speed <= 30 && speed > 0) {
        speed = speed - 2;
    } else if (isOn && speed == 31 || speed <=40 && speed > 0) {
        speed = speed-3;
    } else if (isOn && speed >=41 && speed > 0) {
        speed = speed-4;
    }else if(isOn && speed <= 0){
        this.speed = 0;
    }
    }
    }




