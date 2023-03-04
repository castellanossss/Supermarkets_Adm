package tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManagerReader2 {
	File file;
	FileReader fr;
	BufferedReader br; 
	
	public FileManagerReader2(String path) throws FileNotFoundException {
		file = new File(path);
		fr= new FileReader(file);
		br = new BufferedReader(fr);
	}
	
	public String readFile() throws IOException {
		String line = "";
		String message = "";
		
		while ((line = br.readLine()) != null) {
			String[] values = line.split(";");
			String result = String.join("  ~  ", values);
			message += " -  " +  result + "\n";
		}
		
		if (br != null) {
			br.close();
		}
		return message;
	}
	
}
