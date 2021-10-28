/*
Anders Nelson
Geometry.java
10/28/2021
*/
package geometry.gradle;
import java.util.Scanner;

public class Sphere {
    //calculate the surface area based on radius
    public float surfaceArea(int radius){
        float surfaceArea;
        //sa = 4 * pi *r^2
        surfaceArea = 4 * (float) Math.PI * (float)Math.pow(radius, 2);
        return surfaceArea;
    }
    //calculate the volume based on radius
    public float volume(int radius){
        float volume;
        //v = 4/3*pi*r^2
        // need to write as 4.0 to do correct type of division
        volume = (float)((4.0/3.0)* (float)Math.PI * (float)Math.pow(radius, 3));
        return volume;
    }
    public void Prompt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Sphere");
        System.out.print("Please enter the radius: ");
        String input1 = s.nextLine();
        try{
            int radius = Integer.parseInt(input1);
            System.out.println("The volume is: " + volume(radius));
            System.out.println("The surface area is: " + surfaceArea(radius));
        }
        catch(Exception e){
            System.out.println("Error with input. Please try again.");
        }
    }
}
