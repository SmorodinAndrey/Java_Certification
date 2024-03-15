package core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LongestWordFinder {
    public static String findLongestWord(String fileName) {
        String longestWord = "";
        List<String> longestWords = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                        longestWords.clear();
                        longestWords.add(word);
                    } else if (word.length() == longestWord.length() && !longestWords.contains(word)) {
                        longestWords.add(word);
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (longestWords.size() > 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < longestWords.size(); i++) {
                sb.append(longestWords.get(i));
                if (i < longestWords.size() - 1) {
                    sb.append(", ");
                }
            }
            return sb.toString();
        }

        return longestWord;
    }
}
