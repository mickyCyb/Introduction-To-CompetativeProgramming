import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    
}

class Solution {
    
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> processedStrings = new ArrayList<>();
        int width = 0, wordsCount = 0;

        for (int wordIndex = 0; wordIndex < words.length; wordIndex++) {
            width += words[wordIndex].length();
            wordsCount++;

            if (wordIndex == words.length - 1
                    || width + words[wordIndex + 1].length() + wordsCount - 1 >= maxWidth) {
                int allSpaces = maxWidth - width;
                StringBuilder processedString = new StringBuilder();

                while (--wordsCount >= 0) {
                    processedString.append(words[wordIndex - wordsCount]);
                    int spaces = wordIndex == words.length - 1
                            ? 1
                            : (int) Math.ceil((double) allSpaces / wordsCount);
                    processedString.append(" ".repeat(Math.max(0, Math.min(spaces, allSpaces))));
                    allSpaces -= spaces;
                }

                processedString.append(" ".repeat(Math.max(0, allSpaces)));
                processedStrings.add(processedString.toString());
                wordsCount = 0;
                width = 0;
            }
        }

        return processedStrings;
    }
}
