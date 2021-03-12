package TextReadWrite;

import java.io.IOException;

public class Graphics {

    public static void printWelcome(){
        System.out.println("|-----> Welcome to the File Reader <-----|");
        System.out.println("|                                        |");
        System.out.println("|    -> You can Read and Write TXT       |");
        System.out.println("|    files on this program.              |");
        System.out.println("|                                        |");
        System.out.println("|----------------------------------------|");
    }

    public static void printInstructions(){
        System.out.println("|----------------------------------------|");
        System.out.println("|                                        |");
        System.out.println("|    -> Please select an operation       |");
        System.out.println("|    by entering the number.             |");
        System.out.println("|                                        |");
        System.out.println("|    -> Type -close to terminate         |");
        System.out.println("|    writing process.                    |");
        System.out.println("|                                        |");
        System.out.println("|----------------------------------------|");
    }

    public static void printMainMenu(){
        System.out.println("|--------------> Main Menu <-------------|");
        System.out.println("|                                        |");
        System.out.println("|             1- Create File             |");
        System.out.println("|             2- Import File             |");
        System.out.println("|             3- Set Save Path           |");
        System.out.println("|             4- Exit                    |");
        System.out.println("|                                        |");
        System.out.println("|----------------------------------------|");
    }

    public static void printSecMenu(String s){
        System.out.println("|--------------> " + s + " <--------------|");
        System.out.println("|                                        |");
        System.out.println("|              1- Read File              |");
        System.out.println("|              2- Write File             |");
        System.out.println("|              3- Back                   |");
        System.out.println("|                                        |");
        System.out.println("|----------------------------------------|");
    }

    public static void printFileName(String s){
        System.out.println("|--> " + s);
        System.out.println("------------------------------------------");
    }

    public static void printEndofFile(){
        System.out.println("------------------------------------------");
        System.out.println("> End of the file");
        System.out.println("------------------------------------------");
    }

    public static void printError(){
        Graphics.changeColor(74);
        System.out.println("|----------------------------------------|");
        System.out.println("|                                        |");
        System.out.println("|             ! E R R O R !              |");
        System.out.println("|                                        |");
        System.out.println("|----------------------------------------|");
        Graphics.pressEnt();
    }

    public static void clearScreen(){
        try {
            (new ProcessBuilder("cmd", "/c", "cls")).inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            Graphics.printError();
        }
    }

    public static void changeColor(int a){
        try {
            (new ProcessBuilder("cmd", "/c", "color " + a)).inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            Graphics.printError();
        }
    }

    public static void defColor(){
        try {
            (new ProcessBuilder("cmd", "/c", "color 0F")).inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            Graphics.printError();
        }
    }

    public static void pressEnt(){
        System.out.println("Press enter to continue . . .");
        Input.getString();
    }

}
