//Question 3
import java.util.*;
public class AreaOfTriangle{
        public static void main(String[] args) {

            Scanner sc  = new Scanner(System.in);

            //Taking input from user
            System.out.print("Enter the length of one side of triangle A : ");
            float a = sc.nextFloat();

            System.out.print("Enter the length of one side of triangle B : ");
            float b = sc.nextFloat();

            System.out.print("Enter the length of one side of triangle C : ");
            float c = sc.nextFloat();

            //First  calculate half of the perimeter of triangle
            float halfPerimeter = (a+b+c)/2f;

        // Heron's formula √s(s - a)(s - b)(s - c) calculate heron's formula
            double heronsFormula = Math.sqrt(halfPerimeter*(halfPerimeter-a)*(halfPerimeter-b)*(halfPerimeter-c));

            System.out.printf("The Area of Triangle is : %.2f",heronsFormula);
        }
    }


