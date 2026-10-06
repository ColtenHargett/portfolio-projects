import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> palindromes = new ArrayList<>();
        try {
            File dictionaryFile = new File("dictionary.txt");
            Scanner fileReader = new Scanner(dictionaryFile);

            System.out.println("Opening up the dictionary file...");

            while (fileReader.hasNextLine()) {
                String word = fileReader.nextLine().strip();
                if (isPalindrome(word)) {
                    palindromes.add(word);
                }
            }
            fileReader.close();
            System.out.println("There are " + palindromes.size() + " palindromes in the dictionary.");
        } catch (FileNotFoundException e) {
            System.out.println("The dictionary file was not found.");
            return;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the output file:");
        String newFileName = input.nextLine();

        try {
            PrintWriter outputFile = new PrintWriter(newFileName);
            for (String palindrome : palindromes) {
                outputFile.println(palindrome);
            }
            outputFile.close();
            System.out.println("The palindromes have been written to " + newFileName);
            
        } catch (FileNotFoundException e) {
            System.out.println("Could not create the output file.");
        }
    }


public static boolean isPalindrome(String word) {
    if (word.length() <= 1) {
        return true;
    }
    String lowerCaseWord = word.toLowerCase();
    char firstChar = lowerCaseWord.charAt(0);
    char lastChar = lowerCaseWord.charAt(lowerCaseWord.length() - 1);

    if (firstChar != lastChar) {
        return false;
    }
    String middleWordSubstring = lowerCaseWord.substring(1, lowerCaseWord.length() - 1);
    return isPalindrome(middleWordSubstring);
}

}
    
