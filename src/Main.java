//Question 1
public class Main {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("* Random Phone Number *");
        System.out.println("************************");
        int set1[] = new int[3];
        //Method for  generating set1 which also should not contain 8 and 9
        generateSet1(set1);
        //Calling Method for generating set2 not greater than 831
        int set2 = getSet2();
        int set3 = (int) (Math.random() * 10000);

        //Concatenating all 3 sets in one String
        String phoneNumber = convertToString(set1);
        phoneNumber += "-" + Integer.toString(set2) + "-" + Integer.toString(set3);
        System.out.println("\n\t" + phoneNumber);
    }

    public static void generateSet1(int[] set1) {
        int count = 0;
        int i = 0;
        while(count < 3) {
            //Generate a Random Number except  8 and 9
            int randomNum = (int) (Math.random() * 10);
            if (randomNum < 8) {
                set1[i] = randomNum;
                i++;
                count++;
            }
        }
    }
    public static int getSet2() {
        int count = 0;
        int set2 = 0;
        while (count < 1) {
            int randomNum = (int) (Math.random() * 1000);
            //if 3 digit number is less than 831 return that number
            if (randomNum < 831 && randomNum >= 100) {
                set2 = randomNum;
                count++;
            }
        }
        return set2;
    }

    private static String convertToString(int[] set1) {
        String phoneNumber="";
        for(int j=0;j<3;j++){
            phoneNumber+=Integer.toString(set1[j]);
        }
        return phoneNumber;
    }


}