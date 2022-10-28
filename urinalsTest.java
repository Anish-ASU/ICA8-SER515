import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class urinalsTest {
    @Test
    void testGoodString_true() {
        System.out.println("====== Anish Nair == TEST ONE EXECUTED ======="); 
        urinals ur = new urinals();
         Assertions.assertEquals( true , ur.goodString("1010"));
         Assertions.assertEquals( true , ur.goodString("101110"));
         Assertions.assertEquals( true , ur.goodString("1001010"));
         Assertions.assertEquals( true , ur.goodString("10110010"));
         Assertions.assertEquals( true , ur.goodString("10100111"));
         Assertions.assertEquals( true , ur.goodString("0011010"));
         Assertions.assertEquals( true , ur.goodString("10110100"));
         Assertions.assertEquals( true , ur.goodString("1110010"));
         Assertions.assertEquals( true , ur.goodString("10"));
    }

    void testGoodString_false() {
        System.out.println("====== Anish Nair == TEST TWO EXECUTED ======="); 
        urinals ur = new urinals();
         Assertions.assertEquals( false , ur.goodString("10w10"));
         Assertions.assertEquals( false , ur.goodString("1011A10"));
         Assertions.assertEquals( false , ur.goodString("1001?010"));
         Assertions.assertEquals( false , ur.goodString("1012410010"));
         Assertions.assertEquals( false , ur.goodString("101900111"));
         Assertions.assertEquals( false , ur.goodString("001=1010"));
         Assertions.assertEquals( false , ur.goodString("10;110100"));
         Assertions.assertEquals( false , ur.goodString("111001fef0"));
         Assertions.assertEquals( false , ur.goodString("-10"));
    }

    @Test
    void testCountUrinals() {
        System.out.println("====== Anish Nair == TEST THIRD EXECUTED ======="); 
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
    void testRead() throws IOException {
        System.out.println("====== Anish Nair == TEST FOUR EXECUTED ======="); 
        
         Assertions.assertEquals(null , urinals.read("rule10.txt"));
    }
    
}
