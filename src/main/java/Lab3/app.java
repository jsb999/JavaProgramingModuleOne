package Lab3;

import java.util.Scanner;

public class app{
  public void appMain(){
    Scanner userInput = new Scanner(System.in);  //user input scanner
    CountUpL3 counter = new CountUpL3();  //initial creation of the counter object using the defult class
    boolean programRunning = true;// boolian that controlls the loop

    //creation of the instructions for the user made more for readability than code efficiency allowing for easy customisation
    String SystemInstructions = "----Welcome to the counter----";
    SystemInstructions+= "\nEnter 1 to increment ones";
    SystemInstructions+= "\nEnter 2 to increment tens";
    SystemInstructions+= "\nEnter 3 to increment hundreds";
    SystemInstructions+= "\nEnter 4 to increment thousands";
    SystemInstructions+= "\nEnter 5 to clear the counter";
    SystemInstructions+= "\nEnter 6 to decrement ones";
    SystemInstructions+= "\nEnter 7 to decrement tens";
    SystemInstructions+= "\nEnter 8 to decrement hundreds";
    SystemInstructions+= "\nEnter 9 to decrement thousands";
    SystemInstructions+= "\nEnter 10 to increment by a specific amount";
    SystemInstructions+= "\nEnter -1 to exit the program";
    
    
    
    System.out.println("Welcome to the counter");
     System.out.println("Enter the max value for the counter: ");
    int maxValue = userInput.nextInt();
    counter = new CountUpL3(maxValue);

    //startup sequence for the counter program
    System.out.println("Counter max value set to: " + maxValue);
    System.out.println("Please enter the starting value for the counter: ");
    int startingValue = userInput.nextInt();
    counter.increment(startingValue);
    System.out.println("Counter starting value set to: " + startingValue);

    
    while (programRunning){ //loop so that the program can count up untill the user wants to stop
      System.out.println(SystemInstructions);

      System.out.println("\n\nEnter your choice: ");
      int choice = userInput.nextInt();
      switch (choice){    //switch statement to handle the user's choice with -1 being the break out case to the loop
          case 1:
            counter.ones();
            break;
          case 2:
            counter.tens();
            break;
          case 3:
            counter.hundreds();
            break;
          case 4:
            counter.thousands();
            break;
          case 5:
            counter.clear();
            System.out.println("Counter cleared");
            break;
          case 6:
            counter.decrementOnes();
            break;
          case 7:
            counter.decrementTens();
            break;
          case 8:
            counter.decrementHundreds();
            break;
          case 9:
            counter.decrementThousands();
            break;
          case 10:
            System.out.println("Enter the amount to increment: ");
            int amount = userInput.nextInt();
            counter.increment(amount);
            break;
          case -1:
            programRunning = false;
            break;
          default:
            System.out.println("Invalid choice");
      }

      //final statment of the ccounters values
      System.out.println("Total: " + counter.total());
      System.out.println("Overflows: " + counter.getOverflows());
    }
  }
}