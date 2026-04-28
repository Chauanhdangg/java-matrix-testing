import org.example.PathConfig;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Path;

public class PathConfigTest {

    @Test
    void testLegacyPathBehavior() {
        PathConfig config = new PathConfig();
        Path path = config.getDatabasePath();

        String pathString = path.toString();
        String os = System.getProperty("os.name").toLowerCase();

        System.out.println("Testing on OS: " + os);
        System.out.println("Generated Path: " + pathString);

        assertTrue(pathString.contains("auction.db"));

        if (os.contains("win")) {
            assertTrue(pathString.contains("\\"));
        } else {
            assertTrue(pathString.contains("/"));
        }
    }
}