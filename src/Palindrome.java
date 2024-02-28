//Question 4
import java.util.Scanner;
public class  Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*************************");
        System.out.println("* Enter any Five Words *");
        System.out.println("*************************");
        String wordArr[] = new String[5];
        //Input String array
        for( int i = 0; i < 5 ; i++){
            System.out.print("Enter word "+(i+1)+":  ");
            wordArr[i]=sc.nextLine();
        }
        //Printing out the result
        System.out.println("\n===============================");
        System.out.println("WORD                PALINDROME");
        System.out.println("===============================");

        for( int i = 0 ; i < 5 ; i++ ) {
            System.out.println(wordArr[i]+"\t\t\t\t" + checkPalindrome(wordArr[i]));
        }

    }
    //Method for check weather a string is palindrome or not
    public static String checkPalindrome(String word) {
        word=word.toUpperCase();
        String b = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            b += word.charAt(i);
        }
        if(b.equals(word))
            return " YES ";
        else
            return " NO ";

    }
}
