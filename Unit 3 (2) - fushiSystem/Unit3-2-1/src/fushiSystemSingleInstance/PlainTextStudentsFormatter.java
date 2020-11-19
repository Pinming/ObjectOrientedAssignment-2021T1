package fushiSystemSingleInstance;

/**
 * @author Pinming
 * @date 11/14/2020 2:10 PM
 */

public class PlainTextStudentsFormatter implements StudentsFormatter {
    private static PlainTextStudentsFormatter singletonInstance;

    /**
     * Construct an <object>PlainTextStudentsFormatter</object>.
     */
    private PlainTextStudentsFormatter() {
    }

    /**
     * Construct an <object>XMLTextStudentsFormatter</object>.
     */
    public static PlainTextStudentsFormatter getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new PlainTextStudentsFormatter();
        }
        return singletonInstance;
    }

    /**
     * To format students' exam paper to HTML.
     * @param studentCatalog The catalog of students.
     */
    public String formatStudents(StudentCatalog studentCatalog) {
        String out = "Student Catalog\n";
        for (Student student : studentCatalog.students){
            out += student.getId() + "_" + student.getName() + student.getTestCodeTXT() + '\n';
        }
        return out;
    }
}
