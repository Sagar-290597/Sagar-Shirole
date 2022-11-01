package OOPS;

import lombok.Data;
import java.util.Scanner;
@Data
class StudentDemo {
    int rollNum;
    String studName;
    int  mark1, mark2, mark3 ,totalMarks;
    double averageMarks;
    void SetStudDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Student Id:");
        rollNum = sc.nextInt();
        System.out.println("Enter The Student Name:");
        studName = sc.next();
        System.out.println("Marks For Subject 1:");
        mark1 = sc.nextInt();
        System.out.println("Marks For Subject 2:");
        mark2 = sc.nextInt();
        System.out.println("Marks For Subject 3:");
        mark3 = sc.nextInt();
    }
    double CalculateTotal(){
        totalMarks = mark1 + mark2 + mark3;
        averageMarks = totalMarks/3;
        return averageMarks;
    }
     void displayStudDetails() {
        System.out.println("---------------------------");
        System.out.println("OOPS.Student RollNo: " + rollNum);
        System.out.println("OOPS.Student Name: " + studName);
        System.out.println("Marks in Subject 1: " + mark1);
        System.out.println("Marks in Subject 2: " + mark2);
        System.out.println("Marks in Subject 3: " + mark3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " +averageMarks);
    }
}
public class Student{
    public static void main(String[] args) {
        StudentDemo studentDemo = new StudentDemo();
        studentDemo.SetStudDetails();
        studentDemo.CalculateTotal();
        studentDemo.displayStudDetails();
    }
}