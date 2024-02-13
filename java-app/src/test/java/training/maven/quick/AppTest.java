package training.maven.quick;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new HolaMundo();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }
    

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
