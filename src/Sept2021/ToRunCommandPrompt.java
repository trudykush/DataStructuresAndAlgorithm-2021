package Sept2021;

import java.io.IOException;

public class ToRunCommandPrompt {
    public static void main(String[] args) {
//        String command = "cmd.exe /c start "+"cmd.exe";
//        try {
//            Process child = Runtime.getRuntime().exec(command);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Runtime rt = Runtime.getRuntime();
        String new_dir = "C://";
        try {
            rt.exec("cmd.exe /c cd \""+new_dir+"\" & start cmd.exe javac ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
