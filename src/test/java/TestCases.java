import org.junit.*;
import static org.junit.Assert.*;
public class TestCases {
    @Test
    public void test1(){
        assertEquals(27, Main.cubeX(3));
    }

    @Test
    public void test2(){
        assertEquals(10, Main.squareX(3));
    }
}
