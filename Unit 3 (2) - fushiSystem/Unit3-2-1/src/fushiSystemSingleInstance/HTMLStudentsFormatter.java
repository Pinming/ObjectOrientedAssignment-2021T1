package fushiSystemSingleInstance;

/**
 * @author Pinming
 * @date 11/14/2020 2:10 PM
 */
public class HTMLStudentsFormatter implements StudentsFormatter{
    private static HTMLStudentsFormatter singletonInstance;

    /**
     * Construct an <object>HTMLTextStudentsFormatter</object>.
     */
    private HTMLStudentsFormatter() {
    }

    /**
     * Return a singleton instance of formatter.
     */
    public static HTMLStudentsFormatter getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new HTMLStudentsFormatter();
        }
        return singletonInstance;
    }

    /**
     * To format students' exam paper to HTML.
     * @param studentCatalog The catalog of students.
     */
    public String formatStudents(StudentCatalog studentCatalog){
//        BufferedWriter out = new BufferedWriter(new FileWriter("d:\\out.html"));
        // 文件 output 测试
        String out = "";
        out += ("<html>\n" + "<body>\n" +
                "    <center>\n" +
                "        <h2>学生目录</h2>\n" +
                "    </center>\n" +
                "    <hr>\n");
        for (Student student : studentCatalog.students){
            out += ("    <h4>" + student.getId() + ' ' +student.getName() + "</h4>\n");
            out += ("    <blockquote>\n");
            for(TestItem testItem : student.getExamPaper().testItems){
                out += ("        " + testItem.getCode() + ' ' + testItem.getTitle() + "<br>\n");
            }
            out += ("    </blockquote>\n    <hr>\n");
        }
        out += ("</body>\n" + "</html>");
        return out;
    }
}
