mport java.util.Scanner;

public class testss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int password = 9999;
        System.out.println("Enter password ,please!");

        // Scanner to get user input from keyboard
        int userInput = input.nextInt();
        if (password == userInput) {
            System.out.println("Here is your money,take it");
        } else {
            System.out.println("cnm qiongbi gun");
        }
    }
}
