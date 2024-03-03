import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class Testrunner {

    @Test
    public void upperCaseLetterToMorse(){
        Converter convert = new Converter();

        String expected = ".-";

        String actual = convert.getMorse("A");

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
    public void lowerCaseLetterToMorse(){
        Converter convert = new Converter();

        String expected = "-...";

        String actual = convert.getMorse("b");

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
    public void commaToMorse(){
        Converter convert = new Converter();

        String expected = "--..--";

        String actual = convert.getMorse(",");

        assertEquals(expected,actual);
    }

    @Test
    public void invalidPunctuation(){
        Converter convert = new Converter();

        //Den här konverteringen existerar egentligen, men den finns inte med i mitt
        //program, och ska således inte översättas korrekt.
        String expected = "---...";

        String actual = convert.getMorse(":");

        //Kollar att det INTE är equals!
        assertNotEquals(expected,actual);
    }

    @Test
    public void wordToMorse(){
        Converter convert = new Converter();

        String expected = ".... - .---";

        String actual = convert.getMorse("HEJ");

        assertEquals(expected,actual);
    }
}