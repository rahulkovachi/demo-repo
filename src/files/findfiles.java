package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class findfiles
{
    public static void main(String[] args) throws IOException
    {
        Path currentDirectory = Paths.get(".");

        Predicate<?super Path> predicate= path->String.valueOf(path).contains(".java");
        Files.walk(currentDirectory,4)/*.filter(predicate)*/.forEach(System.out::println);
        System.out.println();
        BiPredicate<Path, BasicFileAttributes>direcotryMatch=(path, attributes)->attributes.isDirectory();
        //Files.find(currentDirectory,4,direcotryMatch).forEach(System.out::println);

    }
}
