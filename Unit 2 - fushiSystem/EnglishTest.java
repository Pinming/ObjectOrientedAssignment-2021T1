package fushiSystem;

/**
 * This class implements a single english test question.
 * @author Pinming
 */
public class EnglishTest extends Test {

    private String initialType;

    @Override
    public String toString() {
        return super.code + " | " + super.title +  " | " + super.difficultyDegree;
    }

    /**
     * Construct an <code>EnglishTest/code> object.
     * @param initialCode
     * @param initialTitle
     * @param initialDifficultyDegree
     * @param initialScoreCriteria
     * @param initialType
     */
    public EnglishTest(String initialCode, String initialTitle, int initialDifficultyDegree, String initialScoreCriteria, String initialType) {
        this.type = initialType;
        super.code  = initialCode;
        super.title = initialTitle;
        super.difficultyDegree = initialDifficultyDegree;
        super.scoreCriteria = initialScoreCriteria;
    }
    private String type;


    /**
     * Get type of an english test question.
     */
    public String getType() {
        return type;
    }

    /**
     * Set type of an english test question.
     */
    public void setType(String type) {
        this.type = type;
    }
}
