package screenObjects;

import java.awt.image.BufferedImage;

public class BufferedImageNode extends BufferedImage {

	private boolean animated;
	private int placeInSequence, lengthOfSequence;
	
	public BufferedImageNode(BufferedImage image, boolean animated, int placeInSequence, int lengthOfSequence) {
		super(image.getWidth(), image.getHeight(), image.getType());
		
	}
}
