package assign.task.apaar4;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryNumber = "1001" ;
        int decimal = Integer.parseInt(binaryNumber, 2);
        System.out.println(binaryNumber + " in binary = " + decimal + " in decimal.");
    }
}
