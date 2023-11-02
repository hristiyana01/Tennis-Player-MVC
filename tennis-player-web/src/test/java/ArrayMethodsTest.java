import JUnit.ArrayMethods;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ArrayMethodsTest {
@Test
    public void test() {
    fail("Not implemented yet.");
}
@Test
    public void findIndexTest_numberInArray() {
    ArrayMethods arrayMethods = new ArrayMethods();
    assertEquals(-1, arrayMethods.findIndex(new int[]{8,4,5}, 1));
}
    @Test
    public void testFindIndex_emptyArray() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertEquals(-1, arrayMethods.findIndex(new int[]{}, 1));
    }
}
