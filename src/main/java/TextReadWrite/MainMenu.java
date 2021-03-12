package TextReadWrite;

public class MainMenu {

    static String savePath = "";

    public void start() {

        while(true) {
            Graphics.clearScreen();
            Graphics.changeColor(70);
            Graphics.printMainMenu();
            switch (Input.getInt(0, 5)) {
                case 1:
                    CreateFile cF = new CreateFile();
                    cF.start();
                    break;
                case 2:
                    ImportFile iF = new ImportFile();
                    iF.start();
                    break;
                case 3:
                    Graphics.clearScreen();
                    System.out.print("Please enter the path :");
                    savePath = Input.getString() + "\\";
                    break;
                case 4:
                    Graphics.defColor();
                    System.out.println("----------------------------------------");
                    System.out.println("> Goodbye!");
                    System.out.println("----------------------------------------");
                    System.exit(0);
                    break;
            }
        }
    }
}
