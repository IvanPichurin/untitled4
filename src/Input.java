import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) throws IOException {
      //  File file = new File("/home/ivan/IdeaProjects/untitled4/out/production/untitled4/1.txt");
      //  file.createNewFile();
        FileWriter writer = new FileWriter("/home/ivan/IdeaProjects/untitled4/out/production/untitled4/1.txt");
        InputStreamReader isr = new InputStreamReader(System.in,"UTF-8" );

        int x = isr.read();



       while ((char)x !='s') {
           StringBuffer sb = new StringBuffer(x);
           sb.append((char)x);
           x = isr.read();
           writer.write(x);
           System.out.print(sb);
        }
        writer.close();
        }



    }


