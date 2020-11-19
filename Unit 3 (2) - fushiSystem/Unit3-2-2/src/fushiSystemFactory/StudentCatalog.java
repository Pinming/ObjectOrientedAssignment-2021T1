package fushiSystemFactory;

import java.util.ArrayList;

/**
 * This class implements a catalog of all students.
 * @author Pinming
 */
public class StudentCatalog{
    public ArrayList<Student> students = new ArrayList<>();

    /**
     * Add a student into the catalog.
     * @param student
     */
    public void addStudent(Student student){
        students.add(student);
    }

    /**
     * Remove a student from the catalog.
     * @param student
     */
    public void removeStudent(Student student){
        students.remove(student);
    }

    /**
     * Get a student by its ID.
     * @param id
     */
    public Student getStudent(String id) {
        for (Student student : this.students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Get a student by its index of the catalog.
     * @param index
     */
    public Student getStudent(int index) {
        for (Student student : this.students)
            if ((students.indexOf(student)) == index) {
                return student;
        }
        return null;
    }

    /**
     * Get number of the students of the catalog.
     */
    public int getNumberOfStudents(){
        return students.size();
    }


}

