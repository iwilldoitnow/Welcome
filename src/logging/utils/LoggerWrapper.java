package logging.utils;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerWrapper {

	public static final Logger logger = Logger.getLogger("Steganography");

	private static LoggerWrapper instance = null;

	public static LoggerWrapper getInstance() {
		if (instance == null) {
			LoggerWrapper.prepareLogger();
			instance = new LoggerWrapper();
		}
		return instance;
	}

	private static void prepareLogger() {
		FileHandler fileHandler = null;
		try {
			fileHandler = new FileHandler("steganography.log");
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileHandler.setFormatter(new SimpleFormatter());
		logger.addHandler(fileHandler);
		logger.setUseParentHandlers(false);
		logger.setLevel(Level.FINEST);
	}

}
