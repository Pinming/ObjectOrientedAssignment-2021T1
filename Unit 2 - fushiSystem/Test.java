package fushiSystem;

/**
 * This class implements a test.
 * @author Pinming
 */
public class Test {
    public String code;
    public String title;
    public int difficultyDegree;
    public String scoreCriteria;

    /**
     * To get the code of specified question in database.
     */
    public String getCode() {
        return code;
    }

    /**
     * To get the title of specified question in database.
     */
    public String getTitle() {
        return title;
    }

    /**
     * To get the difficulty degree of specified question in database.
     */
    public int getDifficultyDegree() {
        return difficultyDegree;
    }

    /**
     * To get the score criteria of specified question in database.
     */
    public String getScoreCriteria() {
        return scoreCriteria;
    }
}
