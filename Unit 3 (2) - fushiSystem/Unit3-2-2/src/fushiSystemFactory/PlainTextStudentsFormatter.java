package fushiSystemFactory;

/**
 * @author Pinming
 * @date 11/14/2020 2:10 PM
 */

public class PlainTextStudentsFormatter implements StudentsFormatter {
    /**
     * Construct a <object>PlainTextStudentsFormatter</object>.
     */
    public PlainTextStudentsFormatter() {
    }

    /**
     * To format students' exam paper to text.
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
