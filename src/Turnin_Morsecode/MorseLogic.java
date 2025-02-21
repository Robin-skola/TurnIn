package Turnin_Morsecode;

import java.util.HashMap;

public class MorseLogic {

    private HashMap<String, String> morseCodeMap;
    private HashMap<String, String> textCodeMap;
// DATA
    public MorseLogic() {
        morseCodeMap = new HashMap<>();
        textCodeMap = new HashMap<>();

        // Populate the Morse code map
        morseCodeMap.put("A", ".-");
        morseCodeMap.put("B", "-...");
        morseCodeMap.put("C", "-.-.");
        morseCodeMap.put("D", "-..");
        morseCodeMap.put("E", ".");
        morseCodeMap.put("F", "..-.");
        morseCodeMap.put("G", "--.");
        morseCodeMap.put("H", "....");
        morseCodeMap.put("I", "..");
        morseCodeMap.put("J", ".---");
        morseCodeMap.put("K", "-.-");
        morseCodeMap.put("L", ".-..");
        morseCodeMap.put("M", "--");
        morseCodeMap.put("N", "-.");
        morseCodeMap.put("O", "---");
        morseCodeMap.put("P", ".--.");
        morseCodeMap.put("Q", "--.-");
        morseCodeMap.put("R", ".-.");
        morseCodeMap.put("S", "...");
        morseCodeMap.put("T", "-");
        morseCodeMap.put("U", "..-");
        morseCodeMap.put("V", "...-");
        morseCodeMap.put("W", ".--");
        morseCodeMap.put("X", "-..-");
        morseCodeMap.put("Y", "-.--");
        morseCodeMap.put("Z", "--..");


        for (String key_me : morseCodeMap.keySet()) {
            textCodeMap.put(morseCodeMap.get(key_me), key_me);
        }
    }

// Omvandlar
    public String textToMorse(String englishText) {
        StringBuilder result = new StringBuilder();

        for (char c : englishText.toUpperCase().toCharArray()) {
            result.append(morseCodeMap.getOrDefault(String.valueOf(c), "")).append(" ");
        }

        return result.toString().trim();
    }

// Omvandlar

    public String morseToText(String morseCode) {
        String[] words = morseCode.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!textCodeMap.containsKey(word)) {
                throw new IllegalArgumentException("Fel: Ogiltig Morse-kod '" + word + "'.");
            }
            result.append(textCodeMap.get(word));
        }

        return result.toString();
    }

}