package utils.image;

import java.awt.image.BufferedImage;

public class ImageIntArray {

	private BufferedImage image;
	private RGBPixel[][] imageArray;

	public ImageIntArray(BufferedImage img) {
		this.image = img;
	}

	public void computeImageIntArray() {
		imageArray = new RGBPixel[image.getWidth()][image.getHeight()];

		for (int xPixel = 0; xPixel < image.getWidth(); ++xPixel) {
			for (int yPixel = 0; yPixel < image.getHeight(); ++yPixel) {
				int color = image.getRGB(xPixel, yPixel);
				imageArray[xPixel][yPixel] = new RGBPixel(color);
				// int color = img.getRGB(xPixel, yPixel);
			}
		}
	}

	public String getPixelsArrayStr() {
		StringBuilder sb = new StringBuilder();
		for (int yPixel = 0; yPixel < image.getHeight(); ++yPixel) {
			for (int xPixel = 0; xPixel < image.getWidth(); ++xPixel) {
				sb.append(String.format("[%d][%d]: %s; ",
						yPixel, xPixel, Integer.toBinaryString(imageArray[xPixel][yPixel].getColor())));
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public void setPixel(int x, int y, int color) {
		image.setRGB(x, y, color);
	}

}
