package copiersupport;
import java.io.*;

//class focusing on turning files to strings
public class SourceFile {
	private String nameOfFile = "";
	private String fileContent = "";
	public static final int EOF = -1;


//constructor that does file reading
	public SourceFile(String nameOfFile) throws IOException {
		this.nameOfFile = nameOfFile;
		FileReader in = new FileReader(this.nameOfFile);
		int character;
		while ((character = in.read()) != EOF) {
			fileContent += (char)character;
		}
		in.close();
	}

//public method that returns string to the myfile copier
	public String returnString() {
		return fileContent;
	}
}