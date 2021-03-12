package TextReadWrite;

public class FileRW {

    public static void main(String[] args) {
        Graphics.clearScreen();
        Graphics.changeColor(71);
        Graphics.printWelcome();
        Graphics.printInstructions();
        Graphics.pressEnt();
        MainMenu mM = new MainMenu();
        mM.start();
    }

}

