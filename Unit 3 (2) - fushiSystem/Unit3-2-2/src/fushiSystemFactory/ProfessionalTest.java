package fushiSystemFactory;

/**
 * This class implements a single professional test question.
 * @author Pinming
 */
public class ProfessionalTest extends Test {

    @Override
    public String toString() {
        return super.code + " | " + super.title +  " | " + super.difficultyDegree;
    }

    /**
     * Construct a <code>ProfessionalTest</code> object.
     * @param initialId from its super class.
     * @param initialTitle from its super class.
     * @param initialDifficultyDegree from its super class.
     * @param initialScoreCriteria from its super class.
     * @param initialProgramInstruction
     * @param initialProgramming
     * @param initialPhotoURL
     */
    public ProfessionalTest(String initialId, String initialTitle,
                            int initialDifficultyDegree, String initialScoreCriteria,
                            String initialProgramInstruction, String initialProgramming,
                            String initialPhotoURL) {
        this.programInstruction = initialProgramInstruction;
        this.programming = initialProgramming;
        this.photoURL = initialPhotoURL;
        super.code  = initialId;
        super.title = initialTitle;
        super.difficultyDegree = initialDifficultyDegree;
        super.scoreCriteria = initialScoreCriteria;
    }

    String programInstruction, programming, photoURL;

    /**
     * Get program instruction of the question.
     */
    public String getProgramInstruction() {
        return programInstruction;
    }

    /**
     * Set program instruction of the question.
     */
    public void setProgramInstruction(String programInstruction) {
        this.programInstruction = programInstruction;
    }

    /**
     * Get programming of the question.
     */
    public String getProgramming() {
        return programming;
    }

    /**
     * Set programming of the question.
     */
    public void setProgramming(String programming) {
        this.programming = programming;
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
}
