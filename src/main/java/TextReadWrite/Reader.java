package TextReadWrite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    private File file;

    Reader(){ this.file = new File("newFile.txt"); }

    Reader(File file){ this.file = file; }

    public void read_print(boolean end) throws IOException {
        Graphics.printFileName(file.getName());
        Scanner scn = new Scanner(file);
        while(scn.hasNextLine()) System.out.println(scn.nextLine());
        scn.close();
         if(end) Graphics.printEndofFile();
    }

    public ArrayList<String> read() throws IOException {
        Scanner scn = new Scanner(file);
        ArrayList<String> als = new ArrayList<String>();
        while(scn.hasNextLine()) als.add(scn.nextLine());
        scn.close();
        return als;
    }
}
