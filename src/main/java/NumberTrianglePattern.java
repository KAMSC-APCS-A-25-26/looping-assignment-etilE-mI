import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {

        // TODO: Step 1 - Get user input


        // TODO: Step 2 - Generate the number triangle pattern

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0)
        {
            System.out.println("Error: Please enter a positive integer.");
        }
        else
        {
            for (int i = 1; i <= number; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        
    }
}