//Question 2 Part A
public class Question2 {
    public static void main(String args[]){
        //Generate random number for radius between 1 to 10
        int radius= (int)(1+Math.random()*10);
        //Generate random number for height between 1 to 10
        int height= (int)(1+Math.random()*10);

        //Declaring  constant value of PI
        final float PI = 3.14f;
        //Volume Formula  V = πr^2h

        //Calculate the volume of cylinder
        double volume = (PI*(radius*radius)*height);

        //Surface Area Formula  A=2πrh+2πr2
        //calculate Surface Area of a cylinder
        double surface_Area = (2*PI*radius*height)+(2*PI*radius*radius);

        //Displaying output
        printOutput(radius, height, volume, surface_Area);
    }

    public static void printOutput(int radius, int height, double volume, double surface_Area) {
        System.out.println("The radius of cylinder is : "+ radius);
        System.out.println("The height of cylinder is : "+ height);
        System.out.println("The volume of cylinder is : "+ volume);
        System.out.println("The Surface Area of cylinder is : " + surface_Area);
    }
}







