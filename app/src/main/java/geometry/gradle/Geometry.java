/*
Anders Nelson
Geometry.java
10/28/2021
*/
package geometry.gradle;
import java.util.Scanner;

public class Geometry {
//main method to display selections
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayPrompt();
            String value = scanner.nextLine();
            //error checking - try to parse an int from the input, otherwise say "invalid input"
            try{
                int option = Integer.parseInt(value);
                if (option == 0) {
                    System.out.println("Bye");
                    break;
                }
                else if (option == 1) {
                    Cone c = new Cone();
                    c.Prompt();
                }
                else if (option == 2) {
                    Cylinder c = new Cylinder();
                    c.Prompt();
                }
                else if (option == 3) {
                    Sphere s = new Sphere();
                    s.Prompt();
                } 
                //if int doesn't match one of the options tell them to try again
                else {
                    System.out.println("Invalid selection!  Please try again.");
                }
            }
            catch(Exception e){
                System.out.println("Invalid input!  Please try again.");
            }
        }
    }

    public static void displayPrompt() {
        System.out.println(
                "\nWelcome to the Java geometry calculator!  Please make your selection.\n1. Cone\n2. Cylinder\n3. Sphere\n0. Quit");
    }
}