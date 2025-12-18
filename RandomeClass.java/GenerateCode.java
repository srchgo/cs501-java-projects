/***************************************
 * GenerateCode.java
 * Generates a set of randomish pass phrases
 * based on user input
 * @author Tammy Pirmann
 * @version 1.0
 ****************************************/

 /* Beginning of pseudocode for GenerateCode.java 
* Import the scanner and ransom class
* Create GenerateCode public class
* Create the main method
* Create random number generator and create scanner reading from keyboard 
* Print welcome message 
* Prompt for the loved one and read from the keyboard as a string 
*  Prompt for a favorite item or food and read from the keyboard as a string 
* Prompt for a memorable place and read from the keyboard as a string
* Prompt for a 4 digit year and read from the keyboard as a string
* Close the keyboard 
* Generate a random number between 2 to 9 
* Create a variable shortFavrt and delete all vowels from favorite from it using the string method replace 
* Create and display 4 unique code suggestions:
    Code 1: lovedOne + year + shortFvrt
    Code 2: shortFvrt + number + place
    Code 3: lovedOne + number + place + year
    Code 4: number + place + year + lovedOne
* Close the Scanner
 */

import java.util.Scanner;
import java.util.Random;
class GenerateCode {

  public static void main (String args[]){

    Random randGen = new Random();
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Welcome to the Code Generator! \n Answer some questions and I will generate a set of codes for your consideration.");

    System.out.println("The name of a loved one: ");
    String lovedOne = keyboard.next();
    keyboard.nextLine();
    System.out.println("A favorite item or food: ");
    String favorite = keyboard.next();
    keyboard.nextLine();
    System.out.println("A memorable place: ");
    String place = keyboard.next();
    keyboard.nextLine();
    System.out.println("A year you can recall (4 digits): ");
    int year = keyboard.nextInt();
    keyboard.nextLine();
    
    lovedOne = lovedOne + "123"; //Manipulated lovedOne using string method
    place = place.toUpperCase(); //Manipulated place making it upper case using string method
    year = (int) Math.pow(year, 2); // used math.pow method to raise the value of year by the power of 2 

    keyboard.close();

    int number = (randGen.nextInt(8))+2;


    String shortFvrt = favorite.replace('a', ' ');
    shortFvrt = shortFvrt.replace('e', ' ');
    shortFvrt = shortFvrt.replace('i', ' ');
    shortFvrt = shortFvrt.replace('o', ' ');
    shortFvrt = shortFvrt.replace('u', ' ');
    shortFvrt = shortFvrt.replace(" ", "");

    System.out.printf("Code #1: %s%d%s\n", lovedOne, year, shortFvrt);
    System.out.printf("Code #2: %s%d%s\n", shortFvrt, number, place);
    System.out.printf("Code #3: %s%d%s%d\n", lovedOne, number, place, year);
    System.out.printf("Code #4: %d%s%d%s\n", number, place, year, lovedOne);

  }
}

