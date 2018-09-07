package copiersupport;
import java.io.*;

public class TargetFile {
	private String nameOfFile = "";
	private String fileContent = "";

	public TargetFile(String nameOfFile, String fileContent) throws IOException {
		this.nameOfFile = nameOfFile + ".copy";
		this.fileContent = fileContent;
	}

	public void copyFile() throws IOException {
		FileWriter out = new FileWriter(this.nameOfFile);
		int character = 0;
		while (character < fileContent.length()) {
			out.write(fileContent.charAt(character));			
			character = character + 1;
		}
		out.close();
	}
}