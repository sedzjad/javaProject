import java.util.Scanner; //imports scanner so I could use user input
import java.util.Random; // imports random picker for words, to pick a random word
public class javaxx {
public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    StringBuffer buffer = new StringBuffer();
    String wordToGuess;
    int wordLength;
    int wordToGuessLength;
    int position;
    int livesLost = 0;
    int totalLives = 7;
    int lettersRemaining;
    boolean guessInWord;
    char guess;
    StringBuffer prevGuessedLetters;

    //declare variable
    //String wordToGuess[] = new String[29];
    //insert array for words and their values

    String[] myStringArray = new String[]{"programming","exhaustive","violin","selection","repetition","serendipity","watermelon","football","mobilephone","handbag","teddybear","cardigan","waterfall","cupcake","pineapple","strawberry","collection","chicken","tablecloth","candlestick","notebook","radiator","champagne","wineyard","parent","circus","snowbell","clocktower","mermaid","cardigan"};


    //Display the rules of the game
        System.out.println("You are playing the game Hang Man. You have to guess the letters in the word. You will see how many letters are in the word and you have 7 changes to be wrong. ");

        //choose a random word from the array
        wordToGuess = myStringArray[(int) (Math.random() * myStringArray.length)];

        //determine the length of the word
        wordLength = wordToGuess.length();

        //show the player how many letters are in the word
        System.out.println("The word you are quessing has " + wordLength + " letters in it");
        lettersRemaining = wordLength;

        for (position = 0; position < wordLength; position++) {
                sb.append("_ ");
        }

    System.out.println(sb.toString());

    //loop starts
    while (lettersRemaining > 0 && livesLost < 7) {
        //prompt user to guess a letter
        System.out.println("Guess a letter:");
        guess = myScanner.findWithinHorizon(".", 0).charAt(0);

        //check if the letter guessed is in the secretWord
        guessInWord = (wordToGuess.indexOf(guess)) != -1;

        if (guessInWord == false) {
            livesLost++;
            System.out.print("Sorry, you have lost a life. You still have ");
           System.out.print(totalLives - livesLost);
            System.out.println(" life/lives left. Keep trying.");
        } else {
            System.out.println("That was a good guess, well done!");

            for (position = 0; position < wordLength; position++) {
                if (wordToGuess.charAt(position) == guess) {
                    System.out.print(guess);
                    lettersRemaining--;
                } else {
                    System.out.print("_ ");
                }
            }
        }
        System.out.println();
        prevGuessedLetters = buffer.append(guess);
        System.out.print("Previously guessed letters: ");
        System.out.println(prevGuessedLetters);
        System.out.print("Letters remaining: ");
        System.out.println(lettersRemaining);
    }

    if (livesLost == totalLives) {
        System.out.println("Sorry, you lose!");
    } else {
        System.out.print("Well done, you win! The word was ");
        System.out.println(wordToGuess);
    }
}
}