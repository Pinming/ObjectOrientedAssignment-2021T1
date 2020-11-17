package fushiSystem;

import java.util.ArrayList;
/**
 * This class implements a question of a generated test.
 * @author Pinming
 */
public class TestItem {
    private Test test;
    private double score;

    @Override
    public String toString() {
        return "" + test;
    }

    /**
     * A constructed function for a test item.
     * Construct a <code>TestItem</code> object.
     * @param initialTest
     * @param initialScore
     */
    public TestItem(Test initialTest, double initialScore){
        this.test = initialTest;
        this.score = initialScore;
    }

    /**
     * Get score of single question.
     */
    public double getScore() {
        return score;
    }

    /**
     * Set score of single question.
     */
    public void setScore(double score) {
        this.score = score;
    }
}
