package osgi.enroute.examples.rest.application;

import junit.framework.TestCase;

public class RestApplicationTest extends TestCase {
    public void testName() throws Exception {
        RestApplication application = new RestApplication();
        assertNotNull(application);
    }
}