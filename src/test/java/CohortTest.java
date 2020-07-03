import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {

    private Cohort firstCohort;
    private Cohort secondCohort;
    private List<Student> students;

    @Before
    public void setUp() throws Exception {
        firstCohort = new Cohort();
        secondCohort = new Cohort();
        students = new ArrayList<>();

        Student michael = new Student(1, "michael");
        Student trey = new Student(2,"trey");
        Student kevin = new Student(3, "kevin");

        michael.addGrade(88);
        trey.addGrade(100);
        kevin.addGrade(99);

        students.add(michael);
        students.add(trey);
        students.add(kevin);
    }

    @Test
    public void testGetCohortAverage() {
        firstCohort.addStudent(students.get(2));
        assertEquals(99, firstCohort.getCohortAverage(), 0);

        secondCohort.addStudent(students.get(1));
        assertEquals(100, secondCohort.getCohortAverage(), 0);
    }

    @Test
    public void testAddStudent() {
        assertTrue(firstCohort.getStudents().isEmpty());
        firstCohort.addStudent(students.get(0));

        firstCohort.addStudent(students.get(1));
        assertFalse(firstCohort.getStudents().isEmpty());

        assertFalse(secondCohort.getStudents().isEmpty());
    }

    @Test
    public void testGetStudents() {
        assertEquals(0,firstCohort.getStudents().size());

        secondCohort.addStudent(students.get(2));
        secondCohort.addStudent(students.get(1));
        assertEquals(1,secondCohort.getStudents().size());
    }
}