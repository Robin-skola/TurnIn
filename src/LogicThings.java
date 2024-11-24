public class LogicThings {
    private int howManyLines;      // Antal rader
    private int howManyCharacters; // Antal tecken
    private int howManyWords;      // Antal ord
    private String longestWord;    // Det längsta ordet

    // Konstruktor sätter värden
    public LogicThings() {
        this.howManyLines = 0;
        this.howManyCharacters = 0;
        this.howManyWords = 0;
        this.longestWord = "";
    }

    // ökar värden och om den returnar true så bryts loopen.
    public boolean processBreak(String textInformation) {
        if (textInformation.trim().equalsIgnoreCase("stop")) {
            return true;
        }

        this.howManyLines++;
        this.howManyCharacters += textInformation.length();

        String[] wordsContainer = textInformation.split("\\s+");
        for (String word : wordsContainer) {
            if (!word.isEmpty()) {
                this.howManyWords++;
                if (word.length() > this.longestWord.length()) {
                    this.longestWord = word;
                }
            }
        }

        return false;
    }
// Return values.
    public int getHowManyLines() {
        return this.howManyLines;
    }

    public int getHowManyCharacters() {
        return this.howManyCharacters;
    }

    public int getHowManyWords() {
        return this.howManyWords;
    }

    public String getLongestWord() {
        return this.longestWord;
    }
}