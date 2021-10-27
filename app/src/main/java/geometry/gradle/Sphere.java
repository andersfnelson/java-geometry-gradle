package geometry.gradle;
import java.util.Scanner;

public class Sphere {
    public float surfaceArea(int radius){
        float surfaceArea;
        surfaceArea = 4 * (float) Math.PI * (float)Math.pow(radius, 2);
        return surfaceArea;
    }
    public float volume(int radius){
        float volume;
        // need to write as 4.0 to do correct type of division
        volume = (float)((4.0/3.0)* (float)Math.PI * (float)Math.pow(radius, 3));
        return volume;
    }
    public void Prompt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Sphere");
        System.out.print("Please enter the radius: ");
        String input1 = s.nextLine();
        // System.out.print("Please enter the height: ");
        // String input2 = s.nextLine();
        try{
            int radius = Integer.parseInt(input1);
            // int height = Integer.parseInt(input2);
            System.out.println("The volume is: " + volume(radius));
            System.out.println("The surface area is: " + surfaceArea(radius));
        }
        catch(Exception e){
            System.out.println("Error with input. Please try again.");
        }
    }
}
