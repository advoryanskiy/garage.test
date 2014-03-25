/**
 * Created with IntelliJ IDEA.
 * Date: 3/25/2014
 * Time: 10:44 AM
 */
public class CoreTest extends junit.framework.TestCase {
    public void testGetVersion() throws Exception {
        assertEquals("1.0", Core.getVersion());
    }
}
