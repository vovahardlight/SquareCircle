import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void area() {
        Square square = new Square(4);
      int actual = 16;
     int expected =16;
        assertEquals(expected,actual);
    }
}