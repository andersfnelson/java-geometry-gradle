/*
Anders Nelson
Cylinder.java
10/28/2021
*/
package geometry.gradle;
import java.util.Scanner;

public class Cylinder {
    //calculate the volume based on radius and height
    public float volume (int radius, int height){
        float volume;
        //pi*r^2*h
        // cast volume and non-floats to a float
        volume = (float) Math.PI * radius * radius * height;
        return volume;
    }
    //calculate the surface area based on radius and height
    public float surfaceArea(int radius, int height){
        float surfaceArea;
        //sa = 2pi*r*h + 2pi*r^2
        surfaceArea = (float) ((2*Math.PI * radius * height) + (2* Math.PI * radius * radius));
        return surfaceArea;
    }
    //calculate the surface area based on radius and height
    public float lateralSurfaceArea(int radius, int height){

        float lateralSurfaceArea;
        //lsa = 2*pi*r*h
        lateralSurfaceArea = (float) Math.PI * 2 * radius * height;
        return lateralSurfaceArea;
    }
    //calculate the top or bottom surface area based on radius
    public float topBottomSurfaceArea(int radius){
        float topBottomSurfaceArea;
        //a = pi*r^2
        topBottomSurfaceArea = (float) Math.PI * radius * radius;
        return topBottomSurfaceArea;
    }
    //Method to get user input and print the calculations
    public void Prompt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Cylinder");
        System.out.print("Please enter the radius: ");
        String input1 = s.nextLine();
        System.out.print("Please enter the height: ");
        String input2 = s.nextLine();
        try{
            int radius = Integer.parseInt(input1);
            int height = Integer.parseInt(input2);
            System.out.println("The volume is: " + volume(radius, height));
            System.out.println("The surface area is: " + surfaceArea(radius, height));
            System.out.println("The lateral surface area is: " + lateralSurfaceArea(radius, height));
            System.out.println("The top or bottom surface area is: " + topBottomSurfaceArea(radius));
        }
        catch(Exception e){
            System.out.println("Error with input. Please try again.");
        }
    }
}
