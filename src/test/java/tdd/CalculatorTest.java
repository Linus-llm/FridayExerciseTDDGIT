package tdd;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator instance = new Calculator();
    @Test
    void additionTest(){
        int result = instance.add(1,2);
        assertEquals(3,result);
    }
    @Test
    void subtractionTest(){
        int result = instance.subtract(6,3);
        assertEquals(3,result);
    }
    @Test
    void multiplicationTest(){
        int result = instance.multiply(4,8);
        assertEquals(32,result);
    }
    @Test
    void divideTest(){
        int result = instance.divide(8,2);
        assertEquals(4,result);
    }
}
