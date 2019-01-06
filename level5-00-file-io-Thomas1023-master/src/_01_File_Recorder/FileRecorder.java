package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
public static void main(String[] args) {
	try {
		FileWriter fw = new FileWriter("src/_01_File_Recorder/temp.txt",true);
		
		
		
		fw.write(JOptionPane.showInputDialog("word"));
			
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
