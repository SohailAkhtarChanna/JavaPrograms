//Question 5
import java.util.*;
public class Question5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        printOptionMenu();

        System.out.println("Enter a messege ");
        //sc.nextLine();
        String messege = sc.nextLine();

        //Store the length of the Messege
        int size = messege.length();

        //Array to Store Unicode of Original  Messege
        int array[] = new int[size];

        //Array to Store Unicode of Encrypted Messege
        int encryptedCode[] = new int[size];

        //Variable to store Encrypted Messege
        String encryptedMessege = "";

        //Variable to store decrypted Messege
        String decryptedMessege = "";

        System.out.print("Please select an option: ");
        int input = sc.nextInt();
        while (input != 4){

            switch (input) {
                case 1:
                    System.out.println("\n======================");
                    System.out.println(" Messege is Encrypted ");
                    System.out.println("=======================");

                    for (int i = 0; i < size; i++) {
                        array[i] = (int) (messege.charAt(i));
                        encryptedCode[i] = (array[i] ^ 2);
                    }
                    System.out.println("*************");
                    break;
                case 2:
                    System.out.println("\n===========================");
                    System.out.println(" View Encrypted Messege ");
                    System.out.println("===========================");
                    for (int i = 0; i < messege.length(); i++) {
                        array[i] = (int) (messege.charAt(i));
                        encryptedMessege += (char) (array[i] ^ 2);
                    }
                    System.out.println("Encrypted Messege = " + encryptedMessege);
                    break;
                case 3:
                    System.out.println("\n=======================================");
                    System.out.println("TO View Encrypted Messege Enter Password ");
                    System.out.println("========================================");
                    sc.nextLine();
                    String password=sc.nextLine();
                    if(password.equals("ABC786")){
                        for(int i=0;i<messege.length();i++) {
                            decryptedMessege += (char) (encryptedCode[i] ^ 2);
                        }

                        System.out.println("Messege Entered: "+decryptedMessege);
                    }

                    break;

                default:
                    System.out.println("You Entered an Invalid Input ");
            }

        System.out.println("\n===========================");
        System.out.println(" Please select an option: ");
        System.out.println("=============================");
        input = sc.nextInt();
    }

    }

    public static void printOptionMenu() {
        System.out.println("=====================================");
        System.out.println(" Select One Of The Following Option ");
        System.out.println("=====================================");
        System.out.println("1.Send a Secure and Encrypted Messege ");
        System.out.println("2.View Encrypted  Messege ");
        System.out.println("3.Decrypt and View the Original Messege ");
        System.out.println("4.EXIT ");
    }

}
