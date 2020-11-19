package fushiSystemFactory;

/**
 * @author Pinming
 * @date 11/20/2020 2:32 AM
 * Factory of information formatter.
 */
public class FormatterFactory {
    /**
     * A method to get the type of formatter and specify the type of exam paper.
     * @param type The target type of the outputted exam paper.
     * @return
     */
    public StudentsFormatter getFormatter(String type) {
        if (type.equalsIgnoreCase("HTML")) {
            return new HTMLStudentsFormatter();
        } else if (type.equalsIgnoreCase("XML")) {
            return new XMLStudentsFormatter();
        } else if (type.equalsIgnoreCase("PlainText")) {
            return new PlainTextStudentsFormatter();
        }
        return null;
    }
}
