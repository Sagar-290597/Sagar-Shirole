package oops.student;

import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) {
        int rollNum;
        String studName;
        int  mark1, mark2, mark3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Student Id: ");
        rollNum = sc.nextInt();
        System.out.println("Enter The Student Name: ");
        studName = sc.next();
        System.out.println("Marks For Subject 1: ");
        mark1 = sc.nextInt();
        if(mark1 > 100){
            System.out.println("Please Enter Proper Marks! ");
            mark1 = sc.nextInt();
        }
        System.out.println("Marks For Subject 2: ");
        mark2 = sc.nextInt();
        if(mark2 > 100){
            System.out.println("Please Enter Proper Marks! ");
            mark2 = sc.nextInt();
        }
        System.out.println("Marks For Subject 3: ");
        mark3 = sc.nextInt();
        if(mark3 > 100){
            System.out.println("Please Enter Proper Marks! ");
            mark3 = sc.nextInt();
        }

        Student student = new Student();
        student.setRollNum(rollNum);
        student.setStudName(studName);
        student.setMark1(mark1);
        student.setMark2(mark2);
        student.setMark3(mark3);
        student.CalculateTotal(student.getMark1(), student.getMark2() , student.getMark3());
        student.displayStudDetails();
    }
}