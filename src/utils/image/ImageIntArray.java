package utils.image;

import java.awt.image.BufferedImage;
import java.util.logging.Logger;

import utils.logging.LoggerWrapper;

public class ImageIntArray {

	private Logger logger;
	private BufferedImage image;
	int width, height = 0;
	private RGBPixel[][] imageArray;

	public ImageIntArray(BufferedImage img) {
		LoggerWrapper.getInstance();
		this.logger = 	LoggerWrapper.logger;
		
		this.image = img;
		this.width = image.getWidth();
		this.height = image.getHeight();
	}

	public void computeImageIntArray() {
		imageArray = new RGBPixel[image.getWidth()][image.getHeight()];

		for (int xPixel = 0; xPixel < this.width; ++xPixel) {
			for (int yPixel = 0; yPixel < this.height; ++yPixel) {
				int color = image.getRGB(xPixel, yPixel);
				imageArray[xPixel][yPixel] = new RGBPixel(color);
				// int color = img.getRGB(xPixel, yPixel);
			}
		}
	}

	public String getPixelsArrayStr() {
		StringBuilder sb = new StringBuilder();
		for (int yPixel = 0; yPixel < height; ++yPixel) {
			for (int xPixel = 0; xPixel < width; ++xPixel) {
				sb.append(String.format("[%d][%d]: %s; ",
						yPixel, xPixel, Integer.toBinaryString(imageArray[xPixel][yPixel].getColor())));
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	// the most important method so far!!
	public void saveMessageInImage(String msg) {
		BitMessage messageBits = new BitMessage(msg.getBytes());
		logger.info("Message to save in image:\n" + msg);
		StringBuilder sb = new StringBuilder();
		sb.append(new String(msg.getBytes()));
		
		// check whether the image is big enough to save the massage
		logger.info("byteArray to save:\n" + sb.subSequence(0, sb.length()));
		if (msg.getBytes().length > this.width*this.height/8) {
			logger.info("Could not save this message!\n Message is too long or the image is too small.");
			return;
		}
		
		for (int yPixel = 0; yPixel < height; ++yPixel) {
			for (int xPixel = 0; xPixel < width; ++xPixel) {
				imageArray[xPixel][yPixel].setBlueBit(7,messageBits.getNextBit());
			}
		}
		logger.info("With saved message" + getPixelsArrayStr());
	}

	public void setPixel(int x, int y, int color) {
		image.setRGB(x, y, color);
	}

}
