import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void getLinks() throws IOException{
        //List<String> toReturn = List.of("https://something.com, some-thing.html");
        ArrayList<String> toReturn = new ArrayList<>();
        toReturn.add("https://something.com");
        toReturn.add("some-thing.html"); 

        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

       //assertEquals("[https://something.com, some-thing.html]", MarkdownParse.getLinks("test-file.md"));  
       assertEquals(toReturn,links);

    }
}