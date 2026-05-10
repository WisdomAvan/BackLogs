package Ac_System;

public class AirCondition {
    private boolean isAcOn = false;
    private int temperature = 0;

    public boolean turnAcOn() {
        temperature =16;
       return isAcOn = true;
    }

    public boolean turnAcOff() {
        temperature = 0;
        return isAcOn = false;
    }

    public int increaseTemperature() {
        if (isAcOn && temperature < 30 ) {
            temperature++;
        }
        return temperature;
    }

    public int decreaseTemperature() {
        if(isAcOn && temperature > 16){
            --temperature;
        }
        return temperature;
    }
}


