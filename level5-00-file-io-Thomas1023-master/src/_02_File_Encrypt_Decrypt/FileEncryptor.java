package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static void main(String[] args) {
		String msg="";
		try {
			FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/temp.txt");
			
			msg =JOptionPane.showInputDialog("word");
			char a[]=msg.toCharArray();
			msg="";
			for (int i = 0; i < a.length; i++) {
				a[i]=(char) (a[i]+1);
				char temp=a[i];
				System.out.println(temp);
				msg+=temp;
			}
			System.out.println(msg);
			fw.write(msg);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
