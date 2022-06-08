package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class readfiles
{
    public static void main(String[] args) throws IOException
    {
        Path pathFileToRead = Paths.get("./src/text");
       // List<String> lines = Files.readAllLines(pathFileToRead);
       // System.out.println(lines);

        Files.lines(pathFileToRead).map(String::toUpperCase).forEach(System.out::println);
    }
}
