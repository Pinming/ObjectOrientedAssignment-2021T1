package fushiSystemFactory;

/**
 * @author Pinming
 * @date 11/20/2020 2:32 AM
 * Interface of information formatter.
 */
public interface StudentsFormatter {
    /**
     * A generalization method for formatting students' exam papers.
     * @param studentCatalog The catalog of students.
     */
    String formatStudents(StudentCatalog studentCatalog);
}
