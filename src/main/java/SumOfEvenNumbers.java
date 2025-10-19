import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {     
        // TODO: Step 1 - Get user input

        // TODO: Step 2 - Validate input
        
        // TODO: Step 3 - Calculate sum of even numbers
        
        // TODO: Step 4 - Display the result

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int num = input.nextInt();

        if (num < 2)
        {
            System.out.println("Error: Input value must be 2 or greater.");
        }
        else
        {
            int sum = 0;
            System.out.print("Even numbers: ");
            for (int i = 2; i <= num; i += 2) {
                sum += i;
                System.out.print(i);
                if (i + 2 <= num)
                {
                    System.out.print(", ");
                }
            }
            System.out.println("\nThe sum of even numbers between 2 and " + num + " is " + sum + ".");
        }

    }
}
