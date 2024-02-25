import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Testrunner {

    @Test
    public void testLettertoMorse(){
        Converter convert = new Converter();

        String expected = ".-";

        String actual = convert.getMorse("A");

        assertEquals(expected,actual);
    }

    @Test
    public void testMorsetoLetter(){
    Converter convert = new Converter();

    String expected = "A";

    String actual = convert.getText(".-");

    assertEquals(expected,actual);

    }
}