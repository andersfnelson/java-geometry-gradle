package geometry.gradle;
import java.util.Scanner;

public class Cone {

    public float volume(int radius, int height){
        float volume;
        volume = (float) Math.PI * (float)(Math.pow(radius, 2)) * (float)(height/3.0);
        return volume;
    }
    public float surfaceArea(int radius, int height){
        float surfaceArea;
        surfaceArea = (float) Math.PI * radius * (radius + (float) Math.sqrt((float)Math.pow((float)height, 2) + (float)Math.pow((float)radius, 2)));
        return surfaceArea;
    }

    public float lateralSurfaceArea(int radius, int height){

        float lateralSurfaceArea;
        lateralSurfaceArea = (float) Math.PI * radius * (float) Math.sqrt((float)Math.pow((float)height, 2) + (float)Math.pow((float)radius, 2));
        return lateralSurfaceArea;
    }

    public float slant(int radius, int height){

        float slant;
        slant = (float)Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        return slant;
    }
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
