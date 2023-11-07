import JUnit.MockingStubbing.StudentDaoStub;
import JUnit.MockingStubbing.StudentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentServiceStubTest {
    @Test
    void testFindTotal() {
        StudentService service = new StudentService(new StudentDaoStub());
        int total = service.findTotal();
        assertEquals(40, total);
    }
}
