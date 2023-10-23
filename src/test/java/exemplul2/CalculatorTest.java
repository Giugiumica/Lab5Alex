package exemplul2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void test1_suma() {
        Calculator c=new Calculator(4,5);
        assertEquals(9,c.suma());
    }

    @Test
    void test2_uma() {
        Calculator c=new Calculator(4,5);
        //assertTrue();
    }

    @Test
    void test3_suma() {
        Calculator c=new Calculator(4,5);
        //assertFalse();
    }
}