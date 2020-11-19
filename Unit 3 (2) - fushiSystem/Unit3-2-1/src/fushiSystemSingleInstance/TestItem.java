package fushiSystemSingleInstance;

/**
 * This class implements a question of a generated test.
 * @author Pinming
 */
public class TestItem {
    private String title;
    private String code;
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
        this.code = initialTest.getCode();
        this.title = initialTest.getTitle();

    }

    /**
     * Get score of single question.
     */
    public double getScore() {
        return score;
    }
    public String getCode() { return code; }
    public String getTitle(){
        return title;
    }

    /**
     * Set score of single question.
     */
    public void setScore(double score) {
        this.score = score;
    }
}
