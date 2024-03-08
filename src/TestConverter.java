import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class TestConverter {

    @Test
    public void upperCaseLetterToMorse(){
        Converter convert = new Converter();

        String expected = ".-";

        String actual = convert.getMorse("A");

        assertEquals(expected,actual);
    }

    @Test
    public void lowerCaseLetterToMorse(){
        Converter convert = new Converter();

        String expected = "-...";

        String actual = convert.getMorse("b");

        assertEquals(expected,actual);
    }

    @Test
    public void morseToLetter(){
    Converter convert = new Converter();

    String expected = "B";

    String actual = convert.getText("-...");

    assertEquals(expected,actual);
    }

    @Test
    public void questionMarkToMorse(){
        Converter convert = new Converter();

        String expected = "..--..";

        String actual = convert.getMorse("?");

        assertEquals(expected,actual);
    }

    @Test
    public void invalidText(){
        Converter convert = new Converter();

        //":"" existerar egentligen i den utökade morse-koden, men den finns inte med i mitt
        //program/hashmap, och ska således inte gå att översätta.
        String expected = "That doesn't match anything in the library, try again.";

        String actual = convert.getMorse(":");

        assertEquals(expected,actual);
    }

    @Test
    public void invalidMorse(){
        Converter convert = new Converter();

        String expected = "That doesn't match anything in the library, try again.";

        String actual = convert.getText("-.-.-.-.-.-.-.-.-.-.");

        assertEquals(expected,actual);
    }

    @Test
    public void wordToMorse(){
        Converter convert = new Converter();

        String expected = ".... . .---";

        String actual = convert.getMorse("HEJ");

        assertEquals(expected,actual);
    }

    @Test
    public void sentenceToMorse(){
        Converter convert = new Converter();

        String expected = ".... --- .-- / .- .-. . / -.-- --- ..-";

        String actual = convert.getMorse("How are you");

        assertEquals(expected,actual);
    }

    @Test
    public void morseToWord(){
        Converter convert = new Converter();

        String expected = "HEJ";

        String actual = convert.getText(".... . .---");

        assertEquals(expected,actual);
    }

    @Test
    public void morseToSentence(){
        Converter convert = new Converter();

        String expected = "HOW ARE YOU";

        String actual = convert.getText(".... --- .-- / .- .-. . / -.-- --- ..-");

        assertEquals(expected,actual);
    }
}