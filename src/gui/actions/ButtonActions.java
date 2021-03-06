package gui.actions;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import utils.logging.LoggerWrapper;

public class ButtonActions {
	
	// logger
	private LoggerWrapper lw = LoggerWrapper.getInstance();

	public static File openGraphicFile() {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("BMP Images", "bmp");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(chooser);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			return chooser.getSelectedFile();
		}
		return null;
	}
}
