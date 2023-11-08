import JUnit.MockingStubbing.StudentDao;
import JUnit.MockingStubbing.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentServiceMockTest {
//    @Mock
//            StudentDao studentDaoMock;
//    @InjectMocks
//    StudentService service;
//   // StudentDao studentDaoMock = mock(StudentDao.class);
    @Test
    void testfindTotal() {
        StudentDao studentDaoMock = mock(StudentDao.class);
        when(studentDaoMock.getMarks()).thenReturn(new int[] {15, 20, 5});

        StudentService studentService = new StudentService(studentDaoMock);
        int total = studentService.findTotal();
        assertEquals(40, total);
    }
    @Test
    void testFindTotal_EmptyArray() {
        StudentDao studentDaoMock = mock(StudentDao.class);
        when(studentDaoMock.getMarks()).thenReturn(new int[] {});

        StudentService studentService = new StudentService(studentDaoMock);
        int total = studentService.findTotal();
        assertEquals(0, total);
    }
}
