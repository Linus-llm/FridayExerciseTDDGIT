package tdd;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator instance = new Calculator();
    @Test
    void additionTest(){
        int result = instance.add("1","2","3");
        assertEquals(6,result);
    }
    @Test
    void arrayTotalSumTest(){
        int result = instance.add(new int[]{1,2,3,4,5,6,7,8,9,10});
        assertEquals(55,result);
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
