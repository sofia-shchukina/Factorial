import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchTrainingTest {
    @Test
    void checkTestRed(){
        //Given
        String alarmLevel="rot";
        //When
        int result = SwitchTraining.check(alarmLevel);
        //Then
        Assertions.assertEquals(0, result);
    }

    @Test
    void checkTestYellow(){
        //Given
        String alarmLevel="gelb";
        //When
        int result = SwitchTraining.check(alarmLevel);
        //Then
        Assertions.assertEquals(30, result);
    }

    @Test
    void checkTestGreen(){
        //Given
        String alarmLevel="grün";
        //When
        int result = SwitchTraining.check(alarmLevel);
        //Then
        Assertions.assertEquals(60, result);
    }

    @Test
    void checkTestPink(){
        //Given
        String alarmLevel="pink";
        //When
        int result = SwitchTraining.check(alarmLevel);
        //Then
        Assertions.assertEquals(0, result);
    }
}