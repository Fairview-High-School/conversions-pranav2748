import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Pranav Erukulapati
 * @version 8/25/2024
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double Fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double Celsius = (Fahrenheit - 32) * 5.0/9.0;
            System.out.println(Fahrenheit + " degrees Fahrenheit is " + Celsius + " degrees Celsius");
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double Feet = keyboard.nextDouble();
            keyboard.nextLine();
            double Meters = Feet * 0.3048;
            System.out.println(Feet + "Feet is" + Meters + "Meters");

        }
    
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double Meters = keyboard.nextDouble();
            keyboard.nextLine();
            double Feet = Meters * 0.3048;
            System.out.println(Meters + "Meters is" + Feet + "Feet");

        }
        if(selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double Ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double Milliliters = Ounces * 29.574;
            System.out.println(Ounces + "Ounces is" + Milliliters + "Milliliters");

        }
        if(selection == 5)
        {
            System.out.println("Enter Milliliters: ");
            double Milliliters = keyboard.nextDouble();
            keyboard.nextline();
            double Ounces = Milliliters / 29.574;
            System.out.println(Milliliters + "Milliliters is" + Ounces + "Ounces"); 
            
            
            
        //add more if statements here.
    }
}
