package junit.miniproject.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        StudentGradeTest.class,
        ValidateStudentTest.class,
        NullCountTest.class
})
public class AllTests {

}