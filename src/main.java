import core.LongestWordFinder;
import core.WordCounter;

public class main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\ALFA\\Documents\\Документы\\Java_Certification\\src\\input.txt";

        int wordCount = WordCounter.countWords(fileName);
        System.out.println("Total number of words in the file: " + wordCount);

        String longestWord = LongestWordFinder.findLongestWord(fileName);
        System.out.println("Longest word in the file: " + longestWord);

    }
}
