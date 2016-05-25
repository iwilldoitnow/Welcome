package utils.image;
//import org.apache.commons.lang.ArrayUtils;

// import org.apache.commons.lang3.ArrayUtils;

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
	    
	    public boolean getBlueBit(int bit) {
	    	return this.blue[bit];
	    }

	    private int computeColor() {
	        int newColor = 0;
	        boolean[] colorArray = concatenateColour(this.alpha, this.red, this.green, this.blue);
	        int aSize = colorArray.length;
	        // compute color
	        for (int i = 0; i < aSize; ++i) {
	        	newColor = (newColor << 1) + (colorArray[i] ? 1 : 0);
	        }
	        return newColor;
	    }
	    
	    private boolean[] concatenateColour(boolean[] alpha, boolean[] red, boolean[] green, boolean[] blue) {
	    	boolean[] colorArray = new boolean[alpha.length+red.length+green.length+blue.length];
	    	int j = 0;
	    	// could be possibly improved
	    	for (int i=0; i < alpha.length;++i) {
	    		colorArray[j] = alpha[i];
	    		++j;
	    	}
	    	for (int i=0; i < red.length;++i) {
	    		colorArray[j] = red[i];
	    		++j;
	    	}
	    	for (int i=0; i < green.length;++i) {
	    		colorArray[j] = green[i];
	    		++j;
	    	}
	    	for (int i=0; i < blue.length;++i) {
	    		colorArray[j] = blue[i];
	    		++j;
	    	}
	    	
	    	return colorArray;
	    }

	    public int getColor() {
	        return this.color;
	    }
}
