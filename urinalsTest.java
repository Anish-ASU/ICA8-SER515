import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class urinalsTest {
    @Test
    void testGoodString() {
        System.out.println("====== Mike Findler == TEST TWO EXECUTED ======="); 
        urinals ur = new urinals();
         Assertions.assertEquals( true , ur.goodString("1010"));
         Assertions.assertEquals( 0 , ur.countUrinals("1010"));
    }
}
