package junit.com.wipro.test;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    TestStringConcat.class,
    Q1.class,
    Q2.class
})
public class AllTests {

}