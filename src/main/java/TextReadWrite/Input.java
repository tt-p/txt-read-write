package TextReadWrite;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static int getInt(int a, int b) {
        int input = 0;
        while(true) {
            try {
                System.out.print("\n> Enter a number : ");
                Scanner scn = new Scanner(System.in);
                input = scn.nextInt();
                if(!(a < input && input < b)) throw new InputMismatchException();

            }catch (InputMismatchException e) {
                System.out.println(">             Invalid Entry!             <\n");
                Graphics.printError();
            }return input;
        }
    }

    public static String getString(){
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

}
