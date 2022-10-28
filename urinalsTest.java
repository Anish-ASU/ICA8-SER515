import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class urinalsTest {
    @Test
    void testGoodString() {
        System.out.println("====== Anish Nair == TEST ONE EXECUTED ======="); 
        urinals ur = new urinals();
         Assertions.assertEquals( true , ur.goodString("1010"));
         
    }

    @Test
    void testCountUrinals() {
        System.out.println("====== Anish Nair == TEST TWO EXECUTED ======="); 
        urinals ur = new urinals();
         Assertions.assertEquals( 0 , ur.countUrinals("1010"));
         Assertions.assertEquals( 0 , ur.countUrinals("10101"));
         Assertions.assertEquals( 0 , ur.countUrinals("1001"));
         Assertions.assertEquals( 0 , ur.countUrinals("101001"));
         Assertions.assertEquals( 1 , ur.countUrinals("100"));
         Assertions.assertEquals( 1 , ur.countUrinals("10001"));
         Assertions.assertEquals( 1 , ur.countUrinals("00"));
         Assertions.assertEquals( 1 , ur.countUrinals("001"));
         Assertions.assertEquals( 1 , ur.countUrinals("10010001"));
         Assertions.assertEquals( 2 , ur.countUrinals("1000100"));
         Assertions.assertEquals( 2 , ur.countUrinals("000"));
         Assertions.assertEquals( 2 , ur.countUrinals("000100"));
         Assertions.assertEquals( 2 , ur.countUrinals("10000"));
         Assertions.assertEquals( -1 , ur.countUrinals("11"));
         Assertions.assertEquals( -1 , ur.countUrinals("110"));
         Assertions.assertEquals( -1 , ur.countUrinals("011"));
         Assertions.assertEquals( -1 , ur.countUrinals("0100110"));
    }

    @Test
    void testMain() {
        
    }

    @Test
    void testRead() {
        
    }
    
}
