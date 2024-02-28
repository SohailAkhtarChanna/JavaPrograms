//Question2 Part B
import java.lang.Math;
import java.util.*;
public class EuclideanFormula {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        //Declaring a 2d Array to store  coordinates of two points in the form of (x,y)
        float arrOfCoordinates [][] = new float[2][2];

        // getting input for the coordinates
        getCoordinates(arrOfCoordinates, input);

        //  Euclidean distance formula is d = sqrt((x2 - x1)^2 + (y2 - y1)^2)

        double distance = Math.sqrt(Math.pow(arrOfCoordinates[1][0]-arrOfCoordinates[0][0],2)+Math.pow(arrOfCoordinates[1][1]-arrOfCoordinates[0][1],2));
        System.out.println("The Euclidean distance is : "+distance);
    }

    public static void getCoordinates(float[][] arrOfCoordinates, Scanner input) {
        for(int i = 0;i<2;i++){
            System.out.println("Enter the coordinate of " + (i+1) + "point (x,y)");
            System.out.print("Enter the x coordinate : ");
            arrOfCoordinates[i][0] = input.nextFloat();
            System.out.print("Enter the y coordinate : ");
            arrOfCoordinates[i][1] = input.nextFloat();
        }
    }
}
