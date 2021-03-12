package TextReadWrite;

import java.io.File;

public class ImportFile extends SecMenu {

    @Override
    public void prepareFile(){
        Graphics.clearScreen();
        System.out.print("Please enter the file path : ");
        String filePath = Input.getString();
        setFile(new File(filePath));
        System.out.println();
    }

}