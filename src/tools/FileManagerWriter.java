package tools;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManagerWriter {
	File file;
	FileWriter fw;
	BufferedWriter bw; 
	
	public FileManagerWriter(String path, String name) throws IOException {
		file = new File(path + name + ".txt");
		fw = new FileWriter(file, true);
		bw = new BufferedWriter(fw);
	}
	
	public void toWriter(String value) throws IOException {
		bw.write(value + "\n");
		bw.close();
	}
	
}

