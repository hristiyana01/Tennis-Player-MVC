package JUnit.MockingStubbing;

public class StudentDaoStub extends StudentDao{
    @Override
    public int[] getMarks() {
        return new int[] {15,20,5};
    }
}
