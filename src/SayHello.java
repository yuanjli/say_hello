import java.util.Scanner;

public class SayHello {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

        for(int i=0; i<=3; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String enteredText = input.nextLine();
            System.out.println("hello " + enteredText);
        }

    }
}
