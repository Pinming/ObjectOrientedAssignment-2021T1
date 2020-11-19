package fushiSystemSingleInstance;

/**
 * @author Pinming
 * @date 11/14/2020 2:10 PM
 */
public class XMLStudentsFormatter implements StudentsFormatter{
    private static XMLStudentsFormatter singletonInstance;

    /**
     * Construct an <object>XMLTextStudentsFormatter</object>.
     */
    private XMLStudentsFormatter() {
    }

    /**
     * Return a singleton instance of formatter.
     */
    public static XMLStudentsFormatter getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new XMLStudentsFormatter();
        }
        return singletonInstance;
    }

    /**
     * To format students' exam paper to HTML.
     * @param studentCatalog The catalog of students.
     */
    public String formatStudents(StudentCatalog studentCatalog) {
        String out = "<StudentCatalog>\n"; // header for file
        for (Student student : studentCatalog.students){
            out += "    <Student id=\"" + student.getId() + "\" name=\"" + student.getName() + "\">\n" +
                    "        <ExamPaper>\n"; // header for student
            for(TestItem testItem : student.getExamPaper().testItems){ // content for student
                out += "            <Test code=\"" + testItem.getCode() + "\">"
                        + testItem.getTitle() + "</Test>\n";
            }
            out += "        </ExamPaper>\n" +
                    "    </Student>\n"; // footer for student
        }
        out += "</StudentCatalog>"; // footer for file
        return out;
    }
}
