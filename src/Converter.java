import java.util.HashMap;

public class Converter {

    //Deklarerar hashmap
    private HashMap<String, String> morseAlphabet = new HashMap<>();

    //Konstruktor som tillderlar värden i hashmappen
    public Converter() {
        morseAlphabet.put("A", ".-");
        morseAlphabet.put("B", "-...");
        morseAlphabet.put("C", "-.-.");
        morseAlphabet.put("D", "-..");
        morseAlphabet.put("E", ".");
        morseAlphabet.put("F", "..-.");
        morseAlphabet.put("G", "--.");
        morseAlphabet.put("H", "....");
        morseAlphabet.put("I", "..");
        morseAlphabet.put("J", ".---");
        morseAlphabet.put("K", "-.-");
        morseAlphabet.put("L", ".-..");
        morseAlphabet.put("M", "--");
        morseAlphabet.put("N", "-.");
        morseAlphabet.put("O", "---");
        morseAlphabet.put("P", ".--.");
        morseAlphabet.put("Q", "--.-");
        morseAlphabet.put("R", ".-.");
        morseAlphabet.put("S", "...");
        morseAlphabet.put("T", "-");
        morseAlphabet.put("U", "..-");
        morseAlphabet.put("V", "...-");
        morseAlphabet.put("W", ".--");
        morseAlphabet.put("X", "-..-");
        morseAlphabet.put("Y", "-.--");
        morseAlphabet.put("Z", "--..");
        morseAlphabet.put("0", "-----");
        morseAlphabet.put("1", ".----");
        morseAlphabet.put("2", "..---");
        morseAlphabet.put("3", "...--");
        morseAlphabet.put("4", "....-");
        morseAlphabet.put("5", ".....");
        morseAlphabet.put("6", "-....");
        morseAlphabet.put("7", "--...");
        morseAlphabet.put("8", "---..");
        morseAlphabet.put("9", "----.");
        morseAlphabet.put(".", ".-.-.-");
        morseAlphabet.put(",", "--..--");
        morseAlphabet.put("?", "..--..");
    }

    public void printWelcome() {
        System.out.println("Welcome to the morse code converter!");
        System.out.println("Here you can convert English letters and numbers to morse code, or vice versa.");
        System.out.println("You can exit any time by just writing 'stop'\n");
        System.out.println("For morse, use '.' for dots and '-' for dashes.");
        System.out.print("Please choose if you want to convert English to morse code (1), or morse code to English (2): ");
    }

    //Översätter text till morse
    public String getMorse(String text) {
        text = text.toUpperCase();
        //Returnerar det korresponderade värdet som ligger sparat vid nyckeln "text"
        return morseAlphabet.get(text);
    }

    //Översätter morse till text
    public String getText(String morse) {
        String text = "";

        //Loopar igenom alla nycklar med hjälp av .keySet()
        for (String key : morseAlphabet.keySet()) {
            //kollar om värdet för den aktuella nyckeln motsvarar den inkommande morsekoden
            if (morseAlphabet.get(key).equals(morse)) {
                text = key;
            }
        }
        return text;
    }
}
