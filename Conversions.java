import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Pranav Erukulapati
 * @version 8/25/2024
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
        System.out.println("7. Miles to Feet");
        System.out.println("8. Feet to Miles");
        System.out.println("9. Gallons to Quarts");
        System.out.println("10. Quarts to Gallons");

        
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
            System.out.println(Feet + " Feet is " + Meters + " Meters");

        }
    
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double Meters = keyboard.nextDouble();
            keyboard.nextLine();
            double Feet = Meters * 3.048;
            System.out.println(Meters + " Meters is " + Feet + " Feet");

        }
        if(selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double Ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double Milliliters = Ounces * 29.574;
            System.out.println(Ounces + " Ounces is " + Milliliters + " Milliliters");

        }
        if(selection == 6)
        {
            System.out.println("Enter Milliliters: ");
            double Milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double Ounces = Milliliters / 29.574;
            System.out.println(Milliliters + " Milliliters is " + Ounces + " Ounces"); 

        }
        if(selection == 7)
        {
            System.out.println("Enter Miles: ");
            double Miles = keyboard.nextDouble();
            keyboard.nextLine();
            double Feet = Miles * 5280;
            System.out.println(Miles + " Miles is " + Feet + " Feet"); 
        }
        if(selection == 8)
        {
            System.out.println("Enter Feet: ");
            double Feet = keyboard.nextDouble();
            keyboard.nextLine();
            double Miles = Feet / 5280;
            System.out.println(Feet + " Feet is " + Miles + " Miles"); 
        }
        if(selection == 9)
        {
            System.out.println("Enter Gallons: ");
            double Gallons = keyboard.nextDouble();
            keyboard.nextLine();
            double Quarts = Gallons * 4;
            System.out.println(Gallons + " Gallons is " + Quarts + " Quarts"); 
        }
        if(selection == 10)
        {
            System.out.println("Enter Quarts: ");
            double Quarts = keyboard.nextDouble();
            keyboard.nextLine();
            double Gallons = Quarts / 4;
            System.out.println(Quarts + " Quarts is " + Gallons + " Gallons"); 
        }
        
        
            
            
            
        //add more if statements here.
    }
}
