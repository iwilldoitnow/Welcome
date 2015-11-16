package utils;

import java.awt.image.BufferedImage;

public class ImageIntArray {
	
	private BufferedImage image;
	private int[][] imageArray;
	
	public ImageIntArray(BufferedImage img) {
		this.image = img;
	}
	
	public void computeImageIntArray() {
		imageArray = new int[image.getWidth()][image.getHeight()];

	    for (int xPixel = 0; xPixel < image.getWidth(); ++xPixel){
	        for (int yPixel = 0; yPixel < image.getHeight(); ++yPixel){
	        	int color = image.getRGB(xPixel, yPixel);
	        	imageArray[xPixel][yPixel] = color;
	            //int color = img.getRGB(xPixel, yPixel);
	        }
	    }
	}
	
	public void printPixelsArray() {
		for (int yPixel = 0; yPixel < image.getHeight(); ++yPixel){
	        for (int xPixel = 0; xPixel < image.getWidth(); ++xPixel){
	        	System.out.printf("[%d][%d]: %s; ", yPixel, xPixel, Integer.toBinaryString(imageArray[xPixel][yPixel]));
	        }
        	System.out.println("\n");
		}
	}

}
