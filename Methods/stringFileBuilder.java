package Methods;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class stringFileBuilder {

    public static void BuilderString(String path)  {
        try {
            String result = Files.readString(Paths.get(path));
            String[] picnic = result.toLowerCase().replaceAll("\\s+"," ").split(" ");
            wordCounter.WordsCounter(picnic);
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }

    }

}
