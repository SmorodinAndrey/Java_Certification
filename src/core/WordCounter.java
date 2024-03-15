package core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static int countWords(String fileName) {
        int wordCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            Map<String, Integer> wordMap = new HashMap<>();

            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (wordMap.containsKey(word)) {
                        wordMap.put(word, wordMap.get(word) + 1);
                    } else {
                        wordMap.put(word, 1);
                    }
                }
                wordCount += words.length;
            }

            reader.close();

            // Print the word frequency
            System.out.println("Word frequency in the file:");
            for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
    }
}
