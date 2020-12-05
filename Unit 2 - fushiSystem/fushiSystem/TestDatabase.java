package fushiSystem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class implements a test database.
 * @author Pinming
 */
public class TestDatabase {
    public static ArrayList<Test> tests = new ArrayList<>();

    /**
     * An iterator of the database.
     * Used for main program to generate an exam paper with 10 questions.
     */
    public Iterator<Test> iterator(){
        return this.tests.iterator();
    }

    /**
     * Add a test question to database.
     * @param test
     */
    public void addTest(Test test){
        tests.add(test);
    }

    /**
     * Remove a test question to database.
     * @param test
     */
    public void removeTest(Test test){
        tests.remove(test);
    }

    /**
     * Get a test question in database by its code.
     * @param code
     */
    public Test getTest(String code) {
        for (Test test : this.tests) {
            if (test.getCode().equals(code)) {
                return test;
            }
        }
        return null;
    }

    /**
     * Get a test question in database by its index.
     * @param index
     */
    public Test getTest(int index) {
        for (Test test : this.tests)
            if ((tests.indexOf(test)) == index) {
                return test;
            }
        return null;
    }

    /**
     * Get number of questions in database.
     */
    public int getNumberOfTests(){
        return tests.size();
    }

}
