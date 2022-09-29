import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double tempC = 0;
        String trash = "";

        System.out.print("Enter your temperature in Celsius: ");

        if (in.hasNextDouble())
        {
            tempC = in.nextDouble();
            double tempF = tempC * 9/5 + 32;
            System.out.println("Your temperature in Fahrenheit is " + tempF);
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You said your number was " + trash);
            System.out.println("You entered an invalid number, restart and try again");
            System.exit(0);
        }
    }
}