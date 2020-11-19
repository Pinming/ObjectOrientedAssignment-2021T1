package fushiSystemSingleInstance;

import java.util.ArrayList;

/**
 * This class implements an exam paper.
 * @author Pinming
 */
public class ExamPaper {
    public ArrayList<TestItem> testItems = new ArrayList<>();

    /**
     * @param testItem
     */
    public void addTestItem(TestItem testItem){
        testItems.add(testItem);
    }

    /**
     * To add an question to the exam paper.
     */
    public double getTotalScore(){
        double TotalScore = 0;
        for (TestItem testItem : testItems){
            TotalScore = TotalScore + testItem.getScore();
        }
        return TotalScore;
    }

    /**
     * To remove an question to the exam paper.
     * @param testItem
     */
    public void removeTestItem(TestItem testItem){
        testItems.remove(testItem);
    }

    /**
     * To get an question of the exam paper by a specified index number.
     * @param index
     */
    public TestItem getTestItem(int index){
        for (TestItem testItem : testItems){
            if (testItems.indexOf(testItem) == index){
                return testItem;
            }
        }
        return null;
    }

    /**
     * To get number of questions of this exam paper.
     */
    public int getNumberOfItems(){
        return testItems.size();
    }
}
