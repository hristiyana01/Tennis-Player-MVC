import JUnit.MockingStubbing.StudentDao;
import JUnit.MockingStubbing.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentServiceMockitoAnnotationsTest {
    @Mock
    StudentDao studentDao;
    @InjectMocks
    StudentService studentService;
    @Test
    void findTotalTest() {
        when(studentDao.getMarks()).thenReturn(new int[] {15,20,5});
        assertEquals(40,studentService.findTotal());
    }
    @Test
    void testFindTotal_EmptyArray() {
        when(studentDao.getMarks()).thenReturn(new int[] {});
        assertEquals(0, studentService.findTotal());
    }
 }
