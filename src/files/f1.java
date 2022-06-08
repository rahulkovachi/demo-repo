package files;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class f1
{
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get(".")).forEach(System.out::println);
    }
}
