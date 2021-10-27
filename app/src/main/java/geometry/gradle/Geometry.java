package geometry.gradle;
import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayPrompt();
            String value = scanner.nextLine();
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
                else {
                    System.out.println("Invalid selection!  Please try again.");
                    // System.out.println(option);
                }
            }
            catch(Exception e){
                System.out.println("Invalid input!  Please try again.");
                // System.out.println(e.getMessage());
            }

        }
    }

    public static void displayPrompt() {
        System.out.println(
                "\nWelcome to the Java geometry calculator!  Please make your selection.\n1. Cone\n2. Cylinder\n3. Sphere\n0. Quit");
    }
}