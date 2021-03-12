package TextReadWrite;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
    private File file;

    Writer(){ this.file = new File("newFile.txt"); }

    Writer(File file){ this.file = file; }

    public void write() throws IOException {
        Reader r = new Reader(file);
        r.read_print(false);
        ArrayList<String> result = r.read();
        String inp;

        do{
            inp = Input.getString();
            if(inp.equals("-close")) break;
            result.add(inp);
        }while(true);
        PrintWriter fW = new PrintWriter(file);
        for(String s: result) fW.write(s + "\n");
        fW.close();
        Graphics.pressEnt();
    }
}
