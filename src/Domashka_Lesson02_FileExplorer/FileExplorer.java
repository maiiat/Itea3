package Domashka_Lesson02_FileExplorer;

	import java.awt.GridLayout;
	import java.io.File;
	import java.lang.reflect.InvocationTargetException;
	import java.util.Arrays;
	import java.util.List;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTree;
	import javax.swing.SwingUtilities;
	import javax.swing.UIManager;
	import javax.swing.UnsupportedLookAndFeelException;
	import javax.swing.event.TreeModelListener;
	import javax.swing.tree.TreeModel;
	import javax.swing.tree.TreePath;

	/**
	 * @author NagasharathK
	 *
	 */
	public class FileExplorer extends JFrame {

	 private JTree fileManagerTree = null;

	 public FileExplorer() {
	  initComponents();
	 }

	 /**
	  * Initializes components
	  */
	 private void initComponents() {
	  this.getContentPane().add(new JScrollPane(createFileManagerTree()));
	  this.setSize(500, 500);
	  this.setResizable(true);
	  this.setTitle("File Manager..");
	 }

	 /**
	  * @return JPanel object which contains other comp...
	  */
	 private JPanel createFileManagerTree() {
	  JPanel panel = new JPanel();
	  panel.setLayout(new GridLayout());

	  fileManagerTree = new JTree();
	  fileManagerTree.setModel(new FilesContentProvider("C:\\"));
	  panel.add(fileManagerTree);
	  return panel;
	 }

	 class FilesContentProvider implements TreeModel {

	  private File node;

	  public FilesContentProvider(String path) {
	   node = new File(path);

	  }

	  @Override
	  public void addTreeModelListener(TreeModelListener l) {

	  }

	  @Override
	  public Object getChild(Object parent, int index) {
	   if (parent == null)
	    return null;
	   return ((File) parent).listFiles()[index];
	  }

	  @Override
	  public int getChildCount(Object parent) {
	   if (parent == null)
	    return 0;
	   return (((File) parent).listFiles() != null) ? ((File) parent).listFiles().length : 0;
	  }

	  @Override
	  public int getIndexOfChild(Object parent, Object child) {
	   List<File> list = Arrays.asList(((File) parent).listFiles());
	   return list.indexOf(child);
	  }

	  @Override
	  public Object getRoot() {
	   return node;
	  }

	  @Override
	  public boolean isLeaf(Object node) {
	   return ((File) node).isFile();
	  }

	  @Override
	  public void removeTreeModelListener(TreeModelListener l) {

	  }

	  @Override
	  public void valueForPathChanged(TreePath path, Object newValue) {

	  }

	 }

}
