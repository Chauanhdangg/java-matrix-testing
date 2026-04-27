import org.example.PathConfig;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Path;

public class PathConfigTest {
    PathConfig config = new PathConfig();

    @Test
    void testLegacyPathBehavior() {
        String path = config.getWindowsStylePath();
        String os = System.getProperty("os.name");
        System.out.println("Running on: " + os + " | Path: " + path);
        assertTrue(path.contains("\\"));
    }

    @Test
    void testModernPathBehavior() {
        Path path = config.getMultiPlatformPath();
        String os = System.getProperty("os.name").toLowerCase();
        String pathString = path.toString();

        System.out.println("OS: " + os + " | Optimized path: " + pathString);
         if (os.contains("win")) {
             assertTrue(pathString.contains("\\"), "Must use \\ in Windows");
         } else {
             assertTrue(pathString.contains("//"), "Must use / in Linux or macOS");
         }
    }
}