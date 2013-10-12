package loading;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class Loader {
	
	public static final String PROTAGONIST_DIR = "Resources/Protagonist/", IMAGES = "Images/";

	
	public static ArrayList<screenObjects.BufferedImageNode>[] getProtagonistImages() {
		ArrayList<screenObjects.BufferedImageNode>[] toReturn = null;
		
		File location = new File(PROTAGONIST_DIR + IMAGES);
		
		ImageFilenameFilter test = new ImageFilenameFilter();
		
		File[] listOfFiles = location.listFiles(test);
		
		toReturn = new ArrayList<BufferedImageNode>[listOfFiles.length];
		
		for(int i = 0; i < listOfFiles.length) {
			
		}
		
		return toReturn;
	}
}
