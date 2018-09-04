package Domashka_Lesson02_FileManager;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.Insets;

public class FileManager1 extends JFrame {

	
	
	File folder = new File("C:\\Users\\maiiat\\Desktop\\Maiia\\new\\");
	String absolutePathString = folder.getAbsolutePath();
	
	Border border = BorderFactory.createLineBorder(Color.GRAY, 1);
	private JTextField textField;
	 
//	JLabel[] jlabelsList;




	FileManager1() {
		
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel absolutePath = new JLabel(absolutePathString);
		absolutePath.setBounds(0, 0, 800, 50);
		getContentPane().add(absolutePath);
		
		textField = new JTextField();
		textField.setBounds(419, 74, 336, 468);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel changeDir = new JLabel("cd\\");
		changeDir.setBounds(10, 84, 381, 21);
		getContentPane().add(changeDir);
				
		initListeners();
		
		
	/*	
		
		
		
		JPanel panel = new JPanel();
		add(panel);
		
		panel.setLayout(new GridLayout());
		setContentPane(panel);
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
		
		
		
		//JPanel panel = new JPanel();
		//panel.setLayout(new GridLayout());
		//setContentPane(panel);
		//setContentPane(frame);
		//panel.setVisible(true);
	//	setVisible(true);
		
		absolutePath= new JLabel(absolutePathString);
		
		absolutePath.setSize(800, 50);
		absolutePath.setLocation(0, 0);
		absolutePath.setBorder(border);
		//panel.add(absolutePath);
		panel.add(absolutePath);
	
		/*
		 * 	int locationOfButtons = 50;
	int widhOfButtons = 399;
	int higtOgButtons = 30;
		chd = new JButton("cd..");
		chd.setLayout(new GridLayout());
		chd.setSize(widhOfButtons, higtOgButtons);
		chd.setLocation(0, locationOfButtons);
		chd.setBorder(border);
		
		rightPart = new JFormattedTextField();
		rightPart.setLayout(new GridLayout());
		rightPart.setSize(400, 520);
		rightPart.setLocation(400, 50);
		*/
		
	
	//	panel.add(chd);
	//	panel.add(rightPart);
		
		/*
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
		*/

/**
		File[] listofFiles = folder.listFiles();
		String[] stringList = folder.list();
		for (int i = 0; i < listofFiles.length; i++) {
			stringList[i] = listofFiles[i].getName();
		}
		jlabelsList = new JLabel[stringList.length];
		for (int i = 0; i < stringList.length; i++) {
			jlabelsList[i] = new JLabel(stringList[i]);
			jlabelsList[i].setSize(widhOfButtons, higtOgButtons);
			jlabelsList[i].setLocation(0, (locationOfButtons + higtOgButtons));
			locationOfButtons = locationOfButtons + higtOgButtons;
			panel.add(jlabelsList[i]).setVisible(true);

	}*/
	}

	private void initListeners() {
	/**	absolutePath.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
		});*/

		/*
		 * chd.addMouseListener(new MouseAdapter(){ public void
		 * mousePressed(MouseEvent e) {
		 * 
		 * absolutePathString = setAbsolutePathString(folder.getParent());
		 * setAbsolutePathFolder(absolutePathString); initListeners(); }});
		 */

	}
}
