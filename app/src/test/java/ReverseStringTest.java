import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class ReverseStringTest{

    private StringReverse stringReverse;

    @Before
    public void init(){
        stringReverse = new StringReverse();
    }

    @Test 
    public void recursionTest(){
        assertEquals("abcdef", stringReverse.recursionVersion("fedcba"));
    } 
}
