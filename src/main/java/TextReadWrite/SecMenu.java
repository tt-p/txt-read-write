package TextReadWrite;

import java.io.File;
import java.io.IOException;

public abstract class SecMenu {

    File file;

    public void start(){

        while(true){
            prepareFile();
            Graphics.clearScreen();
            Graphics.changeColor(70);
            Graphics.printSecMenu(file.getName());
            switch (Input.getInt(0,4)){
                case 1:
                    Graphics.clearScreen();
                    read();
                    break;
                case 2 :
                    Graphics.clearScreen();
                    write();
                    break;
                case 3:
                    break;
                default:
                    Graphics.printError();
                    break;
            }break;
        }
    }

    public void setFile(File file){ this.file = file; }

    public void read(){
        try {
            Reader r = new Reader(file);
            r.read_print(true);
            Graphics.pressEnt();
        }catch (IOException e){
            Graphics.printError();
        }
    }

    public void write(){
        try{
            Writer w = new Writer(file);
            w.write();
        }catch (IOException e){
            Graphics.printError();
        }
    }

    public abstract void prepareFile();

}
