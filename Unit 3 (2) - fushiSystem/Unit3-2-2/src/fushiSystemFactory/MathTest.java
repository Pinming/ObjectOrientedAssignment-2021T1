package fushiSystemFactory;

/**
 * This class implements a single math test question.
 * @author Pinming
 */
public class MathTest extends Test {

    private String initialPhotoURL;
    private String initialCalculationProcess;

    @Override
    public String toString() {
        return super.code + " | " + super.title +  " | " + super.difficultyDegree;
    }

    /**
     * Get photo URL of the question.
     */
    public String getPhotoURL() {
        return photoURL;
    }

    /**
     * Set photo URL of the question.
     */
    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    /**
     * Get calculation process of the question.
     */
    public String getCalculationProcess() {
        return calculationProcess;
    }

    /**
     * Set calculation process of the question.
     */
    public void setCalculationProcess(String calculationProcess) {
        this.calculationProcess = calculationProcess;
    }

    String photoURL;
    String calculationProcess;

    /**
     * Construct a <code>MathTest</code> object.
     * @param initialId
     * @param initialTitle
     * @param initialDifficultyDegree
     * @param initialScoreCriteria
     * @param initialPhotoURL
     * @param initialCalculationProcess
     */
    public MathTest(String initialId, String initialTitle,
                    int initialDifficultyDegree, String initialScoreCriteria,
                    String initialPhotoURL, String initialCalculationProcess) {
        this.photoURL = initialPhotoURL;
        this.calculationProcess = initialCalculationProcess;
        super.code  = initialId;
        super.title = initialTitle;
        super.difficultyDegree = initialDifficultyDegree;
        super.scoreCriteria = initialScoreCriteria;
    }
}
