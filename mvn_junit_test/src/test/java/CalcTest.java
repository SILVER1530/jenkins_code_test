import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.After;
import com.calc.Calc;
import org.junit.Test;

public class CalcTest {


    private int val1,val2;
    private int result;
    Calc calc = new Calc();

    @Before
    public void setup(){
        System.out.println("Before test");
    }

    @After
    public void teardown(){
        System.out.println("After test");
    }

    @Test
    public void testadd1(){
        val1 =5;
        val2 =8;
        result = calc.add(val1,val2);
        assertEquals(13, result);
    }
    @Test
    public void testadd2(){
        val1 = 8;
        val2 = 3;
        result = calc.add(val1,val2);
        assertEquals(result, 11);
    }
    @Test
    public void testsubstract1(){
        val1 = 10;
        val2 = 6;
        result =calc.substract(val1,val2);
        assertEquals(4, result);
    }
    @Test
    public void testsubstract2(){
        val1 = 8;
        val2 = 9;
        result =calc.substract(val1,val2);
        assertEquals(-1, result);
    }
    @Test
    public void testsubstract3(){
        val1 = 6;
        val2 = 3;
        result = calc.substract(val1,val2);
        assertEquals(3, result);
    }
    @Test
    public void testmultiply(){
        val1 = 3;
        val2 = 5;
        result = calc.multiply(val1,val2);
        assertEquals(15,result);
    }
    @Test
    public void test2multiply(){
        val1 = 5;
        val2 = 10;
        result = calc.multiply(val1,val2);
        assertEquals(50, result);
    }
}
