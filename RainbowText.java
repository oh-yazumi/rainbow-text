import java.util.*;
public class RainbowText
{
    public static void main(String[] args)
    {
        int choiceRestart = 1;
        
        //Keeps program running until user chooses to end it
        while (choiceRestart != 0) {
            
            //Variable construction
            Scanner in = new Scanner(System.in);
            String text = "";
            String word = "";
            int choice = 0;
            ArrayList<String> characters = new ArrayList<String>();
            ArrayList<String> words = new ArrayList<String>();
            String code = "";
            int count = 0;
            
            //Asks user for text they want to input and stores it in text String
            System.out.println("What would you like to rainbowfy?");
            text = in.nextLine();
            System.out.println("\nInput \"0\" if you want each word to be a different color or \"1\" if you want each letter ot be a different color.");
            choice = in.nextInt();
            
            //Stores each individual character in text in the characters ArrayList
            for (int i = 0; i < text.length(); i++) {
                characters.add(text.substring(i, i + 1));
            }
            
            //Stores each word in text into the words ArrayList
            for (int i = 0; i < text.length(); i++) {
                if (!text.substring(i, i + 1).equals(" ") && i + 1 < text.length()) {
                    word += text.substring(i, i + 1);
                } else {
                    word += text.substring(i, i + 1);
                    words.add(word);
                    word = "";
                }
            }
            
            
            //Generates code if user chooses to color each individual character
            if (choice == 0) {
                code = CodeGenerator.generate(words);
            } else {
                code = CodeGenerator.generate(characters);
            }
            
            //Prints code
            System.out.println();
            System.out.println("Here is your code:\n");
            System.out.println(code);
            System.out.println("\nWould you like to rainbowfy more text? Input \"1\" to continue, otherwise, \"0\" to end the program.");
            choiceRestart = in.nextInt();
            System.out.println();
        }
        System.out.println("Thank you for using this program!");
    }
}
