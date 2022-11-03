package oops.student;

public class Student {
    private int rollNum;
    private String studName;
    private int  mark1, mark2, mark3 ,totalMarks;
    private double averageMarks;
    public int getRollNum() {
        return rollNum;
    }
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
    public String getStudName() {
        return studName;
    }
    public void setStudName(String studName) {
        this.studName = studName;
    }
    public int getMark1() {
        return mark1;
    }
    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }
    public int getMark2() {
        return mark2;
    }
    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }
    public int getMark3() {
        return mark3;
    }
    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }
    public int getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
    public double getAverageMarks() {
        return averageMarks;
    }
    public void setAverageMarks(double averageMarks) {
        this.averageMarks = averageMarks;
    }
    double CalculateTotal(int mark1 , int mark2 , int mark3){
        totalMarks = mark1 + mark2 + mark3;
        averageMarks = totalMarks/3;
        return averageMarks;
    }
    void displayStudDetails() {
        System.out.println("Student RollNo:     " + rollNum);
        System.out.println("Student Name:       " + studName);
        System.out.println("Marks in Subject 1: " + mark1);
        System.out.println("Marks in Subject 2: " + mark2);
        System.out.println("Marks in Subject 3: " + mark3);
        System.out.println("Total Marks:        " + totalMarks);
        System.out.println("Average Marks:      " +averageMarks);
    }
}
