package Ac_System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {
    private AirCondition ac;

    @BeforeEach
    void setUp() {
        ac = new AirCondition();
    }

    @Test
    void testThatAirConditionIsOffAtCreation(){
        assertTrue(ac.turnAcOn());
    }
    @Test
    void testThatAirConditionIsOn_PutItOff(){
        ac.turnAcOn();
        assertFalse(ac.turnAcOff());
    }

    @Test
    void airConditionIsOn_TemperatureIsIncreased(){
       ac.turnAcOn();
        assertEquals(17,ac.increaseTemperature());
    }

    @Test
    void airConditionIsOn_TemperatureIsIncreased_TemperatureDecreased(){
        ac.turnAcOn();
        for(int tempCount =1; tempCount <= 5; tempCount++){
            ac.increaseTemperature();
        }
        for(int tempCounter =1 ; tempCounter <= 3; tempCounter++){
              ac.decreaseTemperature();
        }
        assertEquals(17, ac.decreaseTemperature());

    }
    @Test
    void airConditionIsOn_WhenIIncreaseTemperatureBeyond30_TemperatureIsStill30(){
        ac.turnAcOn();
        for(int tempCount =1; tempCount <= 16; tempCount++){
            ac.increaseTemperature();
        }
        assertEquals(30,  ac.increaseTemperature());
    }
    @Test
    void airConditionIsOn_WhenIDecreaseTemperatureBelow16_Temperature(){
        ac.turnAcOn();
        for(int tempCount =1; tempCount <=4; tempCount++) {
            ac.decreaseTemperature();
        }
        assertEquals(16, ac.decreaseTemperature());
    }
}