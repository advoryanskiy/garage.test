import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: dvoryanskiy
 * Date: 3/25/2014
 * Time: 10:46 AM
 */
public class GuiTest extends TestCase {
    public void testPrintMessage() throws Exception {
        assertEquals(0, new Gui().printMessage());
    }
}
