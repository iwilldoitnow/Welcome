package gui.actions;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ButtonActions {
	
	public static void openGraphicFile() {
		JFileChooser chooser = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	        "BMP Images", "bmp");
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(chooser);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " +
	            chooser.getSelectedFile().getName());
	    }
	}

}
