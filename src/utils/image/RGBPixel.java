package utils.image;
//import org.apache.commons.lang.ArrayUtils;

import org.apache.commons.lang3.ArrayUtils;

class RGBPixel {
	
	    private boolean[] alpha = new boolean[8];
	    private boolean[] red = new boolean[8];
	    private boolean[] green = new boolean[8];
	    private boolean[] blue = new boolean[8];
	   
	    private int color;
	   
	    public RGBPixel(int color) {
	        this.color = color;
	        
	        String bitArray = Integer.toBinaryString(color);
	        String alphaStr = bitArray.substring(0, 7);
	        String redStr = bitArray.substring(8, 15);
	        String greenStr = bitArray.substring(16, 23);
	        String blueStr = bitArray.substring(24, 31);
	        
	        // alpha
	        for(int i = 0; i < alphaStr.length(); ++i){
	        	if (alphaStr.charAt(i) == '1')
	        		this.alpha[i] = true;
	        	else
	        		this.alpha[i] = false;
	        }
	        // red
	        for(int i = 0; i < redStr.length(); ++i){
	        	if (redStr.charAt(i) == '1')
	        		this.red[i] = true;
	        	else
	        		this.red[i] = false;
	        }
	        // green
	        for(int i = 0; i < greenStr.length(); ++i){
	        	if (greenStr.charAt(i) == '1')
	        		this.green[i] = true;
	        	else
	        		this.green[i] = false;
	        }
	        // blue
	        for(int i = 0; i < blueStr.length(); ++i){
	        	if (blueStr.charAt(i) == '1')
	        		this.blue[i] = true;
	        	else
	        		this.blue[i] = false;
	        }
	    }

	    // same for red, green and alpha
	    public void setBlueBit(int bit, boolean value) {
	        this.blue[bit] = value;
	        this.color = computeColor();
	    }

	    private int computeColor() {
	        int newColor = 0;
	        boolean[] colorArray1 = ArrayUtils.addAll(this.alpha, this.red);
	        boolean[] colorArray2 = ArrayUtils.addAll(this.green, this.blue);
	        boolean[] colorArray = ArrayUtils.addAll(colorArray1, colorArray2);
	        int aSize = colorArray.length;
	        // compute color
	        for (int i = 0; i < aSize; ++i) {
	        	newColor = (newColor << 1) + (colorArray[i] ? 1 : 0);
	        }
	        return newColor;
	    }

	    public int getColor() {
	        return this.color;
	    }
}
