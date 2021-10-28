/*
Anders Nelson
Cone.java
10/28/2021

*/
package geometry.gradle;
import java.util.Scanner;

public class Cone {
    //calculate the volume based on radius and height
    public float volume(int radius, int height){
        float volume;
        //compute volume - pi*radius^2*(height/3)
        //some of these values are doubles - need to convert to float
        volume = (float) Math.PI * (float)(Math.pow(radius, 2)) * (float)(height/3.0);
        return volume;
    }
    //calculate the cone's surface area based on radius and height
    public float surfaceArea(int radius, int height){
        float surfaceArea;

        //a = pi*r(r+sqrt(h^2+r^2))
        surfaceArea = (float) Math.PI * radius * (radius + (float) Math.sqrt((float)Math.pow((float)height, 2) + (float)Math.pow((float)radius, 2)));
        return surfaceArea;
    }
//calculate the cone's lateral surface area based on radius and height
    public float lateralSurfaceArea(int radius, int height){

        float lateralSurfaceArea;
        //lsa = pi *r(sqrt(h^2+r^2))
        lateralSurfaceArea = (float) Math.PI * radius * (float) Math.sqrt((float)Math.pow((float)height, 2) + (float)Math.pow((float)radius, 2));
        return lateralSurfaceArea;
    }
//calculate the cone's slant based on radius and height
    public float slant(int radius, int height){

        float slant;
        //s = sqrt(r^2+h^2)
        slant = (float)Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        return slant;
    }
    //Method to get user input and print the four calculations
    public void Prompt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Cone");
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
            System.out.println("The top or bottom surface area is: " + slant(radius, height));
        }
        catch(Exception e){
            System.out.println("Error with input. Please try again.");
        }
    }
}
