package Lab2;

import java.util.Scanner;

public class app{
  public void appMain(){
    Scanner userInput = new Scanner(System.in);
    double ozIN = 0.0;
    double ozOUT = 0.0;
    atwsL2Converter converter = new atwsL2Converter();
    
    System.out.println("Welcome to the ounces to pounds converter");
    System.out.println("Enter the number of ounces you want to convert to pounds\n\n");

    ozIN = userInput.nextDouble();
    ozOUT = converter.Oz_To_Lbs(ozIN);
    System.out.println(ozOUT + " lbs");

    System.out.println("Thank you for using the ounces to pounds converter \n ---Program End---");
  }
}