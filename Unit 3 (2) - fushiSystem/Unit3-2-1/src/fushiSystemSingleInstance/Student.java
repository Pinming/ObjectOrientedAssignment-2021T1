package fushiSystemSingleInstance;

/**
 * This class implements a single student.
 * @author Pinming
 */
public class Student{
    /**
     * Construct a <code>student</code> object.
     * @param initialId
     * @param initialName
     */
    public Student (String initialId, String initialName) {
        this.name = initialName;
        this.id = initialId;
    }

    @Override
    public String toString() {
        return name + '_' + id ;
    }

    private String name;
    private String id;
    private ExamPaper examPaper;

    /**
     * To get a student's name.
     */
    public String getName() {
        return name;
    }

    /**
     * To get a student's ID.
     */
    public String getId() {
        return id;
    }

    public String getTestCodeTXT(){
        String str = "";
        for (int i = 0; i<examPaper.getNumberOfItems(); i++){
            str += "_" + examPaper.getTestItem(i).getCode();
        }
        return str;
    }


    /**
     * To bind an exam paper which is generated with a student.
     * @param examPaper
     *
     */
    public ExamPaper setExamPaper(ExamPaper examPaper) {
        this.examPaper = examPaper;
        return this.examPaper;
    }

    /**
     * To return the exam paper to main program.
     */
    public ExamPaper getExamPaper() {
        return examPaper;
    }
}
