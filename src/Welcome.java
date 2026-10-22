import java.util.Scanner;

public class Welcome{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter Your first name: ");
        String firstName = Scanner.nextLine();

        System.out.print("Enter Your last name: ");
        String lastName = Scanner.nextLine();
        
        System.out.println("Welcome to the 2nd year," + firstName + " " + lastName);
    }
}