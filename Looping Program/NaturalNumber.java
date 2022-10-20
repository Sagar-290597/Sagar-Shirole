package assign.task.apaar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NaturalNumber
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num=0;
            try {
                System.out.println("Input Numbers Of Terms:");
                num = Integer.parseInt(sc.next());
                if(num<0)
                {
                    throw new IllegalArgumentException();
                }
            }catch(InputMismatchException | IllegalArgumentException e)
            {
                System.out.println("Invalid Input");
                System.out.println("Enter Valid Input");
                System.out.println("Input Numbers Of Terms:");
                num = Integer.parseInt(sc.next());
            }
            int sum = 0;

            int i1 = 0;
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    i1 = i;
                    sum += i1;
                }
            }
            System.out.print("\n");
            System.out.println("the Sum is:" + sum);
        }
    }


