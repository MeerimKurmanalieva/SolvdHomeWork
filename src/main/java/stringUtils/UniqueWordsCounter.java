import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWordsCounter {

    public static void main(String[] args) {

        // Define the input and output file paths
        String inputFile = "/Users/meerimkurmanalieva/Desktop/example.txt";
        String outputFile = "/Users/meerimkurmanalieva/Desktop/output.txt";

        try {
            // Read the contents of the input file into a list of strings
            List<String> lines = FileUtils.readLines(new File(inputFile), "UTF-8");

            // Concatenate all the lines into a single string
            String text = StringUtils.join(lines, " ");

            // Split the text into words using whitespace as the delimiter
            String[] words = StringUtils.split(text);

            // Create a set of unique words
            Set<String> uniqueWords = new HashSet<>();
            for (String word : words) {
                uniqueWords.add(word.toLowerCase()); // convert to lowercase to count case-insensitively
            }

            // Count the number of unique words
            int uniqueWordCount = uniqueWords.size();

            // Write the result to the output file
            FileUtils.writeStringToFile(new File(outputFile), String.valueOf(uniqueWordCount), "UTF-8");
            System.out.println("The number of unique words in the file is: " + uniqueWordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
