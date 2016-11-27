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

		for (int xPixel = 0; xPixel < this.width-1; ++xPixel) {
			for (int yPixel = 0; yPixel < this.height-1; ++yPixel) {
				int color = image.getRGB(xPixel, yPixel);
				imageArray[xPixel][yPixel] = new RGBPixel(color);
			}
		}
	}

	public String getPixelsArrayStr() {
		StringBuilder sb = new StringBuilder();
		for (int xPixel = 0; xPixel < width-1; ++xPixel) {
			for (int yPixel = 0; yPixel < height-1; ++yPixel) {
				sb.append(String.format("[%d][%d]: %s; ",
						xPixel, yPixel, Integer.toBinaryString(imageArray[xPixel][yPixel].getColor())));
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public String readMessageFromImage() {
		boolean[] bitArray = new boolean[height*width];
		int bitIndex = 0;
		for (int xPixel = 0; xPixel < width-1; ++xPixel) {
			for (int yPixel = 0; yPixel < height-1; ++yPixel) {
				boolean val = imageArray[xPixel][yPixel].getBlueBit(7);
				bitArray[bitIndex] = val;
				++bitIndex;
			}
		}
		BitMessage readMessage = new BitMessage(bitArray);
		return readMessage.getStringMessage();
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
		
		boolean exit = false;
			for (int xPixel = 0; xPixel < width-1; ++xPixel) {
				if (exit != true) {
				for (int yPixel = 0; yPixel < height-1; ++yPixel) {
					try{
					imageArray[xPixel][yPixel].setBlueBit(7,messageBits.getNextBit());
					} catch (ArrayIndexOutOfBoundsException exc) {
						logger.info("No more message bits to save");
						exit = true;
						break;
					}
				}
			}
		}
		logger.info("With saved message: \n" + getPixelsArrayStr());
		saveImagePixels();
	}
	
	/*
	 *  save all the colors for pixels in the image
	 */
	private void saveImagePixels() {
		for (int xPixel = 0; xPixel < this.width-1; ++xPixel) {
			for (int yPixel = 0; yPixel < this.height-1; ++yPixel) {
				this.setPixel(xPixel, yPixel, imageArray[xPixel][yPixel].getColor());
			}
		}
	}

	public void setPixel(int x, int y, int color) {
		image.setRGB(x, y, color);
	}

}
