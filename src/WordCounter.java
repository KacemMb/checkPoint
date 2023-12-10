import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your paragraph: ");
        String myString = read.nextLine();
        int vowelCount = 0;
        int wordCount = 0;
        int count = 0;

        while (count < myString.length()) {
            while (count < myString.length() && myString.charAt(count) == ' ') {
                count++;
            }

            if (count < myString.length()) {
                wordCount++;

                while (count < myString.length() && myString.charAt(count) != ' ') {
                    char currentChar = Character.toLowerCase(myString.charAt(count));
                    if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i'
                            || currentChar == 'o' || currentChar == 'u') {
                        vowelCount++;
                    }
                    count++;
                }
            }
        }
        System.out.println(wordCount + " " + vowelCount);
    }
}

