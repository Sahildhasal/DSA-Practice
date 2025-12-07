package practice;

import java.io.IOException;

public class Practice {

    public static void main(String[] args) throws IOException {
        System.out.println("parent process running");

        Process process = Runtime.getRuntime().exec("notepad");

        System.out.println("child process created " + process);
    }
       
}
