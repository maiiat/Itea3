package Domashke_Lesson02_FM;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FM extends JFrame {
	JFrame frame = new JFrame();
	File folder = new File("C:\\Users\\maiiat\\Desktop\\Maiia\\new\\");
	String absolutePathString = folder.getAbsolutePath();
	List <String> stringList = new ArrayList<String>();

	public File getFolder() {
		return folder;
	}

	public void setFolder(String absolutePathString) {
		folder = new File(absolutePathString);
			}

	public String getAbsolutePathString() {
		return absolutePathString;
	}

	public void setAbsolutePathString(String absolutePathString) {
		this.absolutePathString = absolutePathString;
	}

	Border border = BorderFactory.createLineBorder(Color.GRAY, 1);

	JLabel path;
	JLabel changeDir;
	List<JLabel> jlabelsList = new ArrayList<JLabel>();
	JTextArea textFrame;
	JPanel panel;

	int widhOfButtons = 400;
	int higtOgButtons = 30;
	int highOfPath = 30;
	int highOfChangeDir = 30;
	int locationOfButtons = highOfPath + highOfChangeDir;

	FM() {
		super("File Manager");
		path = new JLabel(absolutePathString);
		changeDir = new JLabel("cd\\");
		textFrame = new JTextArea();
		panel = new JPanel();
		panel.setLayout(null);
		panel.add(path);
		path.setSize(790, highOfPath);
		path.setLocation(0, 0);
		panel.add(changeDir);
		changeDir.setSize(widhOfButtons, highOfChangeDir);
		changeDir.setLocation(0, higtOgButtons);
		changeDir.setBorder(border);
		panel.add(textFrame);
		textFrame.setSize(400, 700);
		textFrame.setLocation(400, 30);
		add(panel);
		setSize(820, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
		getListOfFolder(folder);
	}

	public void getListOfFolder(File folder) {
		File[] listofFiles = new File[folder.listFiles().length];
		listofFiles = folder.listFiles();
		System.out.println("listofFiles:" + Arrays.toString(listofFiles));
		
		String[] stringList = new String [listofFiles.length];
		stringList = folder.list();
		for (int i = 0; i < listofFiles.length; i++) {
			stringList[i] = listofFiles[i].getName();
			System.out.println("stringList[i]:"+stringList[i]);
		}

		//jlabelsList;// = new JLabel[stringList.length];
		//locationOfButtons = 30;
			for (int i = 0; i < stringList.length; i++) {
			//jlabelsList[i] = stringList[i];
			jlabelsList.add(i, new JLabel(stringList[i]));
			jlabelsList.get(i).setSize(widhOfButtons, higtOgButtons);
			jlabelsList.get(i).setLocation(10, (locationOfButtons));
			locationOfButtons = locationOfButtons + higtOgButtons;
		//	System.out.println(locationOfButtons);
			panel.add(jlabelsList.get(i)).setVisible(true);
			
			String absolutePathStringTemp = absolutePathString+"\\"+stringList[i];
			System.out.println("absolutePathStringTemp:"+ absolutePathStringTemp);
			jlabelsList.get(i).addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					
					setFolder(absolutePathStringTemp);
					if (getFolder().isDirectory()){
						//absolutePathString = absolutePathStringTemp;
						setFolder(absolutePathStringTemp);
						refreshData();
						//getListOfFolder(getFolder());
					}
					else{System.out.println("Its not directory");
					if (getFileExtension(getFolder()).equals("TXT")||getFileExtension(getFolder()).equals("DOCX")){
						/** try {
					            //
					            // Read some text from the resource file to display in
					            // the JTextArea.
					            //
							 textFrame.read(new InputStreamReader(
					                    getClass().getResourceAsStream(absolutePathStringTemp)),
					                    null);
					        } catch (IOException e) {
					            e.printStackTrace();
					        }

					        getContentPane().add(scrollPane, BorderLayout.CENTER);
					    }*/
						
						System.out.println("Its txt");
					} else if (getFileExtension(getFolder()).equals("JPG")||getFileExtension(getFolder()).equals("PNG")){
						JButton pict = new JButton(new ImageIcon(((new ImageIcon(absolutePathStringTemp)).getImage()).getScaledInstance(259, 170, java.awt.Image.SCALE_SMOOTH)));
						System.out.println("Its jpg or png");}
					
					else{ System.out.println("Its not any of these files");}
					
						}setFolder(absolutePathString);
							}});
				}
		
		locationOfButtons = highOfPath+highOfChangeDir;
		System.out.println("Cycle end");
	}

	public void clearListOfFolder(List<JLabel> buttonsList) {
		//this.jlabelsList = new JLabel[buttonsList.length];
		for (JLabel i : buttonsList) {
		//	jlabelsList[i].setText("");
			//buttonsList.get(i).hide();
			i.hide();
			
		}

	}
	
	private static String getFileExtension(File folder) {
        String fileName = folder.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1).toUpperCase();
        else return "";
    }

	public void refreshData() {
		path.hide();
		clearListOfFolder(jlabelsList);
		setAbsolutePathString(folder.getAbsolutePath());
		System.out.println(absolutePathString);
		path = new JLabel(absolutePathString);
		panel.add(path);
		path.setSize(790, higtOgButtons);
		path.setLocation(0, 0);
		setFolder(absolutePathString);
		System.out.println("folder:" + folder);
		getListOfFolder(folder);
	}

	private void initListeners() {
		changeDir.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (!absolutePathString.equals("C:\\")) {
					path.hide();
					clearListOfFolder(jlabelsList);
					setAbsolutePathString(folder.getParent());
					System.out.println(absolutePathString);
					path = new JLabel(absolutePathString);
					panel.add(path);
					path.setSize(790, higtOgButtons);
					path.setLocation(0, 0);
					setFolder(absolutePathString);
					System.out.println("folder:" + folder);
					getListOfFolder(folder);
				} else {
				}
			}
		});

	}
}
