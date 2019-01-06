package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	JFrame jf= new JFrame();
	JPanel jp=new JPanel();
	JButton add= new JButton("add task");
	JButton view= new JButton("view tasks");
	JButton remove= new JButton("remove tasks");
	JButton save= new JButton("save list");
	JButton load= new JButton("load list");
	JButton bad= new JButton("~");
	int time=5;
	
public static void main(String[] args) {
	ToDoList TDL = new ToDoList();
	TDL.runner();

}
public void runner() {
	 jf.add(jp);
	 jp.add(load);
	 jp.add(bad);
	 jp.add(view);
	 jp.add(remove);
	 jp.add(save);
	 jp.add(add);
	 jf.setVisible(true);
	 bad.addActionListener(this);
	 load.addActionListener( this);
	 view.addActionListener(this);
	 remove.addActionListener(this);
	 save.addActionListener(this);
	 add.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
JButton src = (JButton)e.getSource();
if(src.getText().equals("~")) {
	if(time==0) {
		try {
			java.awt.Desktop.getDesktop().browse(new java.net.URI("https://jcw87.github.io/c2-sans-fight/"));
		} catch (IOException | URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}else {
		time--;
	}
}
}

	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
}
