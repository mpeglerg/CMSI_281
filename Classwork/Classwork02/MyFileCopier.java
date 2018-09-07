import copiersupport.*;
import java.io.*;
import java.util.Scanner;

public class MyFileCopier {
    public static void main(String[] args) throws IOException {
        System.out.println("What is your file name?");
        Scanner userInput = new Scanner( System.in );
        String fileName = userInput.nextLine();

        SourceFile sf = new SourceFile(fileName);
        String fileString = sf.returnString();
        TargetFile tf = new TargetFile(fileName, fileString);
        tf.copyFile();
    }
}
