package utils.image;

import java.util.Arrays;
import java.util.logging.Logger;

import utils.logging.LoggerWrapper;

public class BitMessage {
	private Logger logger;
	
	private boolean[] messageBits;
	private int counter = 0;
	
	
	public BitMessage(boolean[] bits) {
		this.messageBits = bits;
	}
	
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
		    charBits[7] = ((currentByte & 1) != 0);
		    charBits[6] = ((currentByte & 2) != 0);
		    charBits[5] = ((currentByte & 4) != 0);
		    charBits[4] = ((currentByte & 8) != 0);
		    charBits[3] = ((currentByte & 16) != 0);
		    charBits[2] = ((currentByte & 32) != 0);
		    charBits[1] = ((currentByte & 64) != 0);
		    charBits[0] = ((currentByte & 128) != 0);
		    
		    //save boolean[] into messageBits
			logger.info("CharBits: " + Arrays.toString(charBits));
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
	
	public String getStringMessage() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < messageBits.length; i+=8) {
			byte currentChar = 0;
			
			// get particular bits into the currentChar
			if (messageBits[i])
				currentChar += 1;
			if (messageBits[i+1])
				currentChar += 2;
			if (messageBits[i+2])
				currentChar += 4;
			if (messageBits[i+3])
				currentChar += 8;
			if (messageBits[i+4])
				currentChar += 16;
			if (messageBits[i+5])
				currentChar += 32;
			if (messageBits[i+6])
				currentChar += 64;
			if (messageBits[i+7])
				currentChar += 128;
			sb.append(currentChar);
		}
		
		return sb.toString();
	}

}
