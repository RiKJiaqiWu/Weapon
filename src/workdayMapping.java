import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class workdayMapping {

    public static void main(String[] args) throws IOException {
//        int data = datedif("1971-7-1","2023-7-1","d");
        workdayMapping Mapping1 = new workdayMapping();
        List<String> lib = Mapping1.getMapping_ver1p0();
        System.out.println(lib);
    }

    @Test
    public List getMapping_ver1p0() throws IOException {
        List<String> lines = Files.readAllLines(Path.of("usages/WorkDayMapping/Mapping2023.txt"), StandardCharsets.UTF_8 );
        return lines;
    }
    @Test
    public void getMapping(){
        File file = new File("usages/WorkDayMapping/Mapping2023.txt");
        try {
            FileReader fr = new FileReader(file);
            int data = fr.read();

            while (data != -1) {
                System.out.print((char)(data));
                data = fr.read();
            }

        }catch(IOException E) {
            E.printStackTrace();
        }
    }
}
