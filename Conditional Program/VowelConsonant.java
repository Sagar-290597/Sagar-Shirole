package assign.task.apaar;

import java.util.Scanner;

public class VowelConsonant
{
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Alphabet");
        ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("Alphabet is Vowel");
        }
        else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Alphabet is Vowel");
        }
        else
        {
            System.out.println("Alphabet is Consonant");
        }}
}
