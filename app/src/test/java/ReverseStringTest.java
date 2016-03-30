import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;

public class ReverseStringTest{

    //private static StringReverse stringReverse;

    //@BeforeClass
    //public void init(){
    //}

    @Test 
    public void recursionTest(){
        StringReverse stringReverse = new StringReverse();    
        assertEquals("abcdef", stringReverse.recursionVersion("fedcba"));
    } 
}
