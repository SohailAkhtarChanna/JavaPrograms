import java.util.*;
public class Try {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  messege ");
        String a=sc.nextLine();
        String decrypt="";
        int b[]=new int[a.length()];
        int e[]=new int[a.length()];
        String en = getString(a, b, e);

        decrypt = decryptMessege(a, decrypt, e);
        for(int elmt:b)
        {
            System.out.print(elmt+"  ");
        }
        System.out.println("\n");
        for(int elmt:e)
        {
            System.out.print(elmt+" ");
        }
        System.out.println("\n");
        System.out.println("\n" + en);
        System.out.println("\n");
        System.out.println("\n"+decrypt);
    }

    public static String decryptMessege(String a, String decrypt, int[] e) {
        for(int i = 0; i< a.length(); i++){
            decrypt +=(char)(e[i]^2);
        }
        return decrypt;
    }

    public static String getString(String a, int[] b, int[] e) {
        String en="";
        for(int i = 0; i< a.length(); i++){
           b[i]=(int)(a.charAt(i));
            e[i]=(b[i]^2);
            en+=(char)(e[i]);
        }
        return en;
    }

}