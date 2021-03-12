package TextReadWrite;

import java.io.File;
import java.io.IOException;

public class CreateFile extends SecMenu {

    @Override
    public void prepareFile(){
        Graphics.clearScreen();
        System.out.print("Please enter the file name : ");
        String fileName = MainMenu.savePath + Input.getString() + ".txt";
        setFile(new File(fileName));
        try {
            file.createNewFile();
        }catch (IOException e){
            Graphics.printError();
        }
        System.out.println();
    }
}
