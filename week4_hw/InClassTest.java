import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class InClassTest {
    private EH eh1; private EH eh2; private EH eh3;

   //  Question 1
   @Before 
   public void setUp() { eh1 = new EH(3); eh2 = new EH(5); eh3 = new EH(3); }

   // Question 2
   @Test
   public void noNPE() {
       System.out.println("noNPE");
       boolean expResult = false;
       boolean result = eh1.equals(null);
       assertEquals(expResult, result);
   }          
   
   // Question 3
   @Test public void equalsFalse() {
       System.out.println("equalsFalse");
       boolean expResult = false;
       boolean result = eh1.equals(eh2);
       assertEquals(expResult, result);
   }    

   // Question 4
   @Test public void equalsTrue() {
       System.out.println("equalsTrue");
       boolean expResult = true;
       boolean result = eh1.equals(eh3);
       assertEquals(expResult, result);
   }     

   // Question 5
   @Test public void hashConsistent() {
       System.out.println("hashConsistent");
       boolean expResult = true;
       int hashCheck = eh1.hashCode();
       EH eh4 = new EH(hashCheck);
       boolean result = eh1.equals(eh4);
       assertEquals(expResult, result);   
   }
    
}