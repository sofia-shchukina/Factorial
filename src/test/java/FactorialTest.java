import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void calculateFactorial() {
        int value = 5;
        int result = Factorial.calculateFactorial(value);
        Assertions.assertEquals(120, result);
    }

    @Test
    void calculateFactorialWithWhile(){
        int value = 4;
        int result = Factorial.calculateFactorialWithWhile(value);
        Assertions.assertEquals(24, result);
    }

    @Test
    void calculateFactorialWithWhileTest(){
        int value = -100;
        int result = Factorial.calculateFactorialWithWhile(value);
        Assertions.assertEquals(-1, result);
    }
}