import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {

    @Test
    public void testCreatesStudent(){
        Student michael = new Student(1, "michael");
        Student trey = null;
        assertNull(trey);
        assertNotNull(michael);
    }

    @Test
    public void testStudentFields(){
        Student michael = new Student(1, "michael");
        assertSame(1, michael.getId());
        assertSame("michael", michael.getName());
        assertSame(0, michael.getGrades().size());
    }

    @Test
    public void testAddGrade(){
        Student michael = new Student(1, "michael");
        michael.addGrade(90);
        assertSame(90, michael.getGrades().get(0));
        michael.addGrade(78);
        assertSame(78, michael.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student michael = new Student(1, "michael");
        michael.addGrade(98);
        michael.addGrade(88);
        assertEquals(78, michael.getGradeAverage(), 0);
    }
}
