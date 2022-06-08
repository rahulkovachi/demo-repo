package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class write
{
    public static void main(String[] args) throws IOException
    {
        Path pathFileToWrite = Paths.get("./src/file-write.txt");
        List<String>l=List.of("Hello","There","Here","123");
        Files.write(pathFileToWrite,l);

    }
}