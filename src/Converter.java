import java.util.HashMap;

public class Converter {

    //Deklarerar hashmap
    private HashMap<String, String> morseAlphabet = new HashMap<>();

    //Konstruktor som tilldelar värden i hashmappen
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
        morseAlphabet.put(" ", "/");
    }

    public void printWelcome() {
        System.out.println("Welcome to the morse code converter! Here you can convert English to morse code, or vice versa.");
        System.out.println("Exit by writing 'stop'\n");
        System.out.println("Use '.' for dots and '-' for dashes in morse, put a space between each letter/character and space + '/' between words.");
        System.out.println("Please choose if you want to convert English to morse code (1), or morse code to English (2): ");
    }

    //Översätter text till morse
    public String getMorse(String text) {
        text = text.toUpperCase();
        String morse = "";

        for (int i = 0; i < text.length(); i++) {
            //Kollar tecken för tecken i inkommande "text"-Stringen om det matchar något i hashmapen
            if (morseAlphabet.containsKey(String.valueOf(text.charAt(i)))) {
                //Sparar det korresponderande värdet som ligger vid nyckeln "text" i en String "morse" för retur i slutet av metoden
                morse += (morseAlphabet.get(String.valueOf(text.charAt(i))));
                morse += " ";
            } else {
                //Felmeddelande om det inte finns någon match
                morse = "That doesn't match anything in the library, try again.";
            }
        }
        return morse.trim(); //Returnerar det som sparats i "morse" och trimmar bort trailing white space i slutet
    }

    //Översätter morse till text
    public String getText(String morse) {
        String text = "";

        //Delar upp den inkommande morsekoden i en array separerade av mellanslag (som motsvarar mellanrum mellan tecken)
        String[] morseArray = morse.split(" ");

        //Loopar igenom morseArray för att checka och översätta varje morse-string/tecken
        for (int i = 0; i < morseArray.length; i++) {
            //if-sats för att kolla om värdet finns i hashmapen och kunna ge felmeddelande om inte
            if (morseAlphabet.containsValue(morseArray[i])) {
                //Loopar igenom alla nycklar i hashmapen med hjälp av .keySet()
                for (String key : morseAlphabet.keySet()) {
                    //kollar om värdet för den aktuella nyckeln motsvarar den inkommande morsekoden, och sparar i så fall värdet i "text"
                    if (morseAlphabet.get(key).equals(morseArray[i])) {
                        text += key;
                    }
                }
            } else {
                //Felmeddelande om det inte finns någon match
                text = "That doesn't match anything in the library, try again.";
            }
        }
        return text;
    }
}
