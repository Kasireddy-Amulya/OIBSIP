import javax.swing.*;
 
public class NumberGuessingGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random()*100 + 1);
        int playerGuess = 0;
        int count = 1;

        while (playerGuess != randomNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100", "NumberGuessing Game", 3);
            playerGuess = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(playerGuess, randomNumber, count));
            count++;
        }  
    }

    public static String determineGuess(int playerGuess, int randomNumber, int count){
        if (playerGuess <=0 || playerGuess >100) {
            return "Your guess is invalid";
        }
        else if (playerGuess == randomNumber ){
            return "Correct! You Win!\nTotal Guesses: " + count;
        }
        else if (playerGuess > randomNumber) {
            return "Nope! The number is higher.\nGuess again.\nTry Number: " + count;
        }
        else if (playerGuess < randomNumber) {
            return "Nope! The number is lower.\nGuess again.\nTry Number: " + count;
        }
        else {
            return "your guess is incorrect.\nTry Number: " + count;
        }
    }
}
