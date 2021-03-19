import java.util.Scanner;
import javax.swing.JOptionPane; 

public class ExtraCreditDoLoop
{
  public static void main(String[] arg)
  {
    
    //CONSTANTS
    final int THREE_DIGIT_PASSCODE = 123;
    
    //VARIABLES
    int maxNumberInput;
    int invalidRandomGuesses = 0;
   
    //ARRAYS
    
    //OBJECTS
    Scanner keyboardInput = new Scanner(System.in);
    
    //SOLUTION
    CS170.information("Cole Mooney", "Extra Crdit", "Do Loop");
       
    //Input
    maxNumberInput = Integer.parseInt(JOptionPane.showInputDialog("Enter Maximum Attempt Number"));
    
    //Loop
    do 
    
    {
        System.out.print("Invalid Guess: " + invalidRandomGuesses);
        invalidRandomGuesses++;
    }
    while(THREE_DIGIT_PASSCODE != maxNumberInput);

       
    //Results
    JOptionPane.showMessageDialog(null, "Number of random guesses" + invalidRandomGuesses);
   
    keyboardInput.close();
    
    }
}

