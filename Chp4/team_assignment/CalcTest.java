import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void testAdd() {
        assertTrue ("Calc sum incorrect", 5 == Calc.add (2, 3));
    }

    @Test
    public void testSubstract() {
        assertTrue ("Calc substract incorrect", 3 == Calc.substract (5, 2));
    }
    
    @Test
    public void testMultiply() {
        assertTrue ("Calc multiply incorrect", 6 == Calc.multiply (2, 3));
    }
    
    @Test
    public void testDivideInts() {
        assertTrue ("Calc divide for int incorrect", 3 == Calc.divide (6, 2));
    }

    @Test
    public void testDivideFloats() {
        assertEquals(2.5f, Calc.divide(5, 2), 0);
    }
}