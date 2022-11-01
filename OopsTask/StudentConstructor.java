package OOPS;

class SetStudDetails {
    int rollNum;
    String studName;
    int  mark1, mark2, mark3 ,totalMarks;
    double averageMarks;

    SetStudDetails(int rollNum, String studName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    double CalculateTotal(){
        totalMarks = mark1 + mark2 + mark3;
        averageMarks = totalMarks/3;
        return averageMarks;
    }
    void displayStudDetails() {
        System.out.println("Student RollNo: " + rollNum);
        System.out.println("Student Name: " + studName);
        System.out.println("Marks in Subject 1: " + mark1);
        System.out.println("Marks in Subject 2: " + mark2);
        System.out.println("Marks in Subject 3: " + mark3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " +averageMarks);
    }
}
public class StudentConstructor{
    public static void main(String[] args) {
        SetStudDetails studentDemo = new SetStudDetails(69 , "ll" , 89 , 96 , 92);
        studentDemo.CalculateTotal();
        studentDemo.displayStudDetails();
    }
}