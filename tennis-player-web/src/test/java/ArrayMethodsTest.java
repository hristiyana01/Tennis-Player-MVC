import JUnit.ArrayMethods;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class    ArrayMethodsTest {
@Test
    public void test() {
    fail("Not implemented yet.");
}

    @Test
    public void testfindIndex_numberInArray() {
        //1. create object of the class
        ArrayMethods arrayMethods = new ArrayMethods();
        //2. call method
        int result = arrayMethods.findIndex(new int[]{8,4,5}, 4);
        //3. compare the actual results to the expected
        assertEquals(1, result);
    }
@Test
    public void findIndexTest_numberInArray() {
    ArrayMethods arrayMethods = new ArrayMethods();
    assertEquals(-1, arrayMethods.findIndex(new int[]{8,4,5}, 1), "The findIndex " +
            "method finds the index of a given number.");
}
    @Test
    public void testFindIndex_emptyArray() {
        ArrayMethods arrayMethods = new ArrayMethods();
        assertEquals(-1, arrayMethods.findIndex(new int[]{}, 1));
    }
    @Test
    void testAssertBoolean() {
        Boolean condition = true;
        assertEquals(true,true);
        assertTrue(condition);
    }
    @Test
    void testAssertString() {
        String str = null;
        assertEquals(null, str);
        assertNull(str);
    }
    @Test
    @Disabled
    public void testSortArray() {
        fail("unimplemented method");
    }
    @Test
    public void testFindIndex_indexOutOfBound() {
    ArrayMethods arrayMethods = new ArrayMethods();
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayMethods.printArray(new int[] {1,8,5}, 3));
    }
    @Test
    public void testFindIndex() {
    ArrayMethods arrayMethods = new ArrayMethods();
    assertAll(
            () -> assertEquals(1, arrayMethods.findIndex(new int[] {8,4,5}, 4)),
            () -> assertEquals(-1, arrayMethods.findIndex(new int[] {8,4,5}, 1)),
            () -> assertEquals(-1, arrayMethods.findIndex(new int[] {}, 1))
    );
    }
    @BeforeEach
    void init() {
    //initializing the object
        ArrayMethods arrayMethods;
        System.out.println("Initializing before test.");
        arrayMethods = new ArrayMethods();
    }
    @AfterEach
    void afterEachTest(){
        System.out.println("Clean up after test");
    }
    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Run this code before all tests");
    }
    @AfterAll
    static void afterAllTests() {
        System.out.println("Run this code after all tests");
    }
}
