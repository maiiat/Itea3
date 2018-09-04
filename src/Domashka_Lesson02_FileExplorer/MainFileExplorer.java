package Domashka_Lesson02_FileExplorer;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainFileExplorer {
	 /**
	  * @param args
	  * @throws InvocationTargetException
	  * @throws InterruptedException
	  * @throws UnsupportedLookAndFeelException
	  * @throws IllegalAccessException
	  * @throws InstantiationException
	  * @throws ClassNotFoundException
	  */
	 public static void main(String[] args) throws InvocationTargetException, InterruptedException,
	   ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
	  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	  FileExplorer explorerUI = new FileExplorer();
	  SwingUtilities.invokeAndWait(new Runnable() {
	   @Override
	   public void run() {
	    explorerUI.setVisible(true);
	   }
	  });
	 }
	}
	 

