package utils.image;

import java.util.logging.Logger;

import utils.logging.LoggerWrapper;

public class BitMessage {
	private Logger logger;
	
	private boolean[] messageBits;
	private int counter = 0;
	
	public BitMessage(byte messageChars[]) {
		LoggerWrapper.getInstance();
		this.logger = 	LoggerWrapper.logger;
		
		this.messageBits = new boolean[messageChars.length*8];
		int bitPos = 0;
		
		for (int i = 0; i < messageChars.length; ++i) {
			byte currentByte = messageChars[i];
			logger.info("Char: " + currentByte);
			//convert byte to boolean[]
		    boolean charBits[] = new boolean[8];
		    charBits[0] = ((currentByte & 0x01) != 0);
		    charBits[1] = ((currentByte & 0x02) != 0);
		    charBits[2] = ((currentByte & 0x04) != 0);
		    charBits[3] = ((currentByte & 0x08) != 0);
		    charBits[4] = ((currentByte & 0x16) != 0);
		    charBits[5] = ((currentByte & 0x32) != 0);
		    charBits[6] = ((currentByte & 0x64) != 0);
		    charBits[7] = ((currentByte & 0x128) != 0);
		    
		    //save boolean[] into messageBits
			logger.info("CharBits: " + charBits.toString());
			for (int j = 0; j < charBits.length; ++j) {
				this.messageBits[bitPos] = charBits[j];
				++bitPos;
			}
		}
		
	}
	
	public boolean getNextBit() {
		boolean ret =  messageBits[counter];
		++counter;
		return ret;
	}

}
